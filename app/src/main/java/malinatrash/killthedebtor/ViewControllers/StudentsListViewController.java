package malinatrash.killthedebtor.ViewControllers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import malinatrash.killthedebtor.R;
import malinatrash.killthedebtor.adapters.StudentAdapter;
import malinatrash.killthedebtor.models.Group;
import malinatrash.killthedebtor.models.Student;
import malinatrash.killthedebtor.models.Teacher;
import malinatrash.killthedebtor.services.StateManager;

public class StudentsListViewController extends AppCompatActivity {
    private StudentAdapter adapter;
    private ListView studentsList;
    private Group group;
    private Student student;
    private List<Student> students = new ArrayList<>();
    private CheckBox showOnlyDebtorsCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
        studentsList = findViewById(R.id.debtsList);
        showOnlyDebtorsCheckBox = findViewById(R.id.showOnlyDebtors);
        adapter = new StudentAdapter(this, students);
        studentsList.setAdapter(adapter);
        getGroup();
        addShowOnlyDebtorsCheckBoxListener();
        studentsList.setOnItemClickListener((parent, view, position, id) -> getItem(position));
    }

    private void setAdapter() {
        if (showOnlyDebtorsCheckBox.isChecked()) {
            ArrayList<Student> temp = new ArrayList<>();
            students.forEach(s -> {
                if (StateManager.shared.isDebtor(s.getAcademicPerformances())) {
                    temp.add(s);
                }
            });
            adapter.setStudents(temp);
            return;
        }
        adapter.setStudents(students);
    }

    private void addShowOnlyDebtorsCheckBoxListener() {
        showOnlyDebtorsCheckBox.setOnClickListener(v -> setAdapter());
    }

    @Override
    protected void onResume() {
        super.onResume();
        setAdapter();
        addShowOnlyDebtorsCheckBoxListener();
        adapter.notifyDataSetChanged();
    }

    private void getGroup() {
        group = StateManager.shared.getCurrentGroup();
        setGroupName();
        students = group.getStudents();
    }

    private void getItem(int position) {
        student = students.get(position);
        navigateToStudentsList();
    }

    private void navigateToStudentsList() {
        Intent intent = new Intent(this, DebtsListViewController.class);
        sendStudent();
        startActivity(intent);
    }

    private void sendStudent() {

        StateManager.shared.setCurrentStudent(student);
    }

    private void setGroupName() {
        TextView groupName = findViewById(R.id.groupname);
        if (groupName != null) groupName.setText(group.getTitle());
    }
}
