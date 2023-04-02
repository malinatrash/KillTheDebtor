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
import java.util.List;
import java.util.Objects;

import malinatrash.killthedebtor.R;
import malinatrash.killthedebtor.adapters.DebtAdapter;
import malinatrash.killthedebtor.models.Debt;
import malinatrash.killthedebtor.models.Measure;
import malinatrash.killthedebtor.models.Student;
import malinatrash.killthedebtor.services.ActivityManager;
import malinatrash.killthedebtor.services.StateManager;

public class DebtsListViewController extends AppCompatActivity {
    private final Measure measure = StateManager.shared.getCurrentStudent().getAcademicPerfomance().getMeasure();
    private Button sendGradeButton;
    private CheckBox isPassedCheckBox;
    private EditText gradeTextField;
    private ListView debtsList;
    private TextView studentName;
    private Student student;
    private List<Debt> debts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debts_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getStudent();
        debtsList = findViewById(R.id.debtsList);
        DebtAdapter adapter = new DebtAdapter(this, debts);
        debtsList.setAdapter(adapter);
        setLayout();
        handleTextField();
        handleCheckBoxClick();
        setSendGradeButtonListener();
    }

    private void handleCheckBoxClick() {
        if (measure.equals(Measure.CREDIT) && student.getAcademicPerfomance().getGrade() != null) {
            isPassedCheckBox.setChecked((Boolean) student.getAcademicPerfomance().getGrade());
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
        gradeTextField.setOnFocusChangeListener((v, hasFocus) -> {
            debtsList.setVisibility(View.GONE);
        });
    }

    private void setLayout() {
        sendGradeButton = findViewById(R.id.sendGrade);
        isPassedCheckBox = findViewById(R.id.isPassed);
        gradeTextField = findViewById(R.id.gradeTextField);

        if (measure.equals(Measure.CREDIT)) {
            sendGradeButton.setVisibility(View.GONE);
            gradeTextField.setVisibility(View.GONE);
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
        switch (measure) {
            case EXAM:
                int grade = 0;
                if (gradeTextField.getText() != null && !gradeTextField.getText().toString().isEmpty()) {
                    int inputGrade = Integer.parseInt(gradeTextField.getText().toString());
                    if (inputGrade >= 1 && inputGrade <= 5) {
                        grade = inputGrade;
                        student.getAcademicPerfomance().setGrade((grade));
                    }
                }
                break;
            default:
                student.getAcademicPerfomance().setGrade(isPassedCheckBox.isChecked());
                break;
        }
    }

    private void getStudent() {
        student = StateManager.shared.getCurrentStudent();
        studentName = findViewById(R.id.stud);
        studentName.setText(student.getFirstname() + " " + student.getLastname());
        debts = student.getDebts();
    }
}