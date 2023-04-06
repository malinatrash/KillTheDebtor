package malinatrash.killthedebtor.ViewControllers;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Objects;

import malinatrash.killthedebtor.R;
import malinatrash.killthedebtor.adapters.DebtAdapter;
import malinatrash.killthedebtor.models.AcademicPerformance;
import malinatrash.killthedebtor.models.Measure;
import malinatrash.killthedebtor.models.Student;
import malinatrash.killthedebtor.services.ActivityManager;
import malinatrash.killthedebtor.services.DatabaseManager;
import malinatrash.killthedebtor.services.StateManager;

public class DebtsListViewController extends AppCompatActivity {
    private Measure measure;
    private Button sendGradeButton;
    private CheckBox isPassedCheckBox;
    private EditText gradeTextField;
    private ListView debtsList;
    private Student student;
    private ArrayList debts = new ArrayList<>();
    private AcademicPerformance academicPerformance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debts_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getStudent();
        academicPerformance = StateManager.shared.getAcademicPerformance(student.getAcademicPerformances());
        measure = academicPerformance.getMeasure();
        debtsList = findViewById(R.id.debtsList);
        DebtAdapter adapter = new DebtAdapter(this, debts);
        debtsList.setAdapter(adapter);
        setLayout();
        handleTextField();
        handleCheckBoxClick();
        setSendGradeButtonListener();
    }

    private void handleCheckBoxClick() {
        if (measure.equals(Measure.CREDIT) && academicPerformance.getGrade() != null) {
            isPassedCheckBox.setChecked((Boolean) academicPerformance.getGrade().getCredit());
        }
        isPassedCheckBox.setOnClickListener(e -> {
            if (isPassedCheckBox.isChecked()) {
                isPassedCheckBox.setText("Зачтено");
            } else {
                isPassedCheckBox.setText("Не зачтено");
            }
            sendGrade();
        });
    }

    private void handleTextField() {
        gradeTextField.setOnFocusChangeListener((v, hasFocus) -> debtsList.setVisibility(View.GONE));
    }

    private void setLayout() {
        sendGradeButton = findViewById(R.id.sendGrade);
        isPassedCheckBox = findViewById(R.id.isPassed);
        gradeTextField = findViewById(R.id.gradeTextField);

        if (measure.equals(Measure.CREDIT)) {
            sendGradeButton.setVisibility(View.GONE);
            gradeTextField.setVisibility(View.GONE);
            if (academicPerformance.getGrade() == null) {
                isPassedCheckBox.setText("Не зачтено");
            } else if (((Boolean) academicPerformance.getGrade().getCredit())) {
                isPassedCheckBox.setText("Зачтено");
            } else {
                isPassedCheckBox.setText("Не зачтено");
            }
        } else if (measure.equals(Measure.EXAM)) {
            isPassedCheckBox.setVisibility(View.GONE);
        }
    }

    private void setSendGradeButtonListener() {
        sendGradeButton.setOnClickListener(e -> {
            ActivityManager.hideKeyboard(this);
            debtsList.setVisibility(View.VISIBLE);
            sendGrade();
            onBackPressed();
        });
    }

    private void sendGrade() {
        if (measure == Measure.EXAM) {
            int grade;
            if (gradeTextField.getText() != null && !gradeTextField.getText().toString().isEmpty()) {
                int inputGrade = Integer.parseInt(gradeTextField.getText().toString());
                if (inputGrade >= 1 && inputGrade <= 5) {
                    grade = inputGrade;
                    academicPerformance.setPerformance((grade));
                    DatabaseManager.shared.updateData();
                }
            }
        } else {
            academicPerformance.setCredit(isPassedCheckBox.isChecked());
            DatabaseManager.shared.updateData();
        }
    }

    private void getStudent() {
        student = StateManager.shared.getCurrentStudent();
        TextView studentName = findViewById(R.id.stud);
        studentName.setText(String.format("%s %s", student.getFirstname(), student.getLastname()));
        debts =  StateManager.shared.getDebts(student.getAcademicPerformances());
    }
}