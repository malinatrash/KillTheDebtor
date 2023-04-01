package malinatrash.killthedebtor.ViewControllers;

import android.content.Intent;
import android.os.Bundle;
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
import malinatrash.killthedebtor.services.StateManager;

public class StudentsListViewController extends AppCompatActivity {
    private ListView studentsList;
    private TextView groupName;
    private Group group;
    private Student student;
    private List<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
        studentsList = findViewById(R.id.debtsList);
        render();
    }

    @Override
    protected void onResume() {
        super.onResume();
        render();
    }

    private void render() {
        getGroup();
        StudentAdapter adapter = new StudentAdapter(this, students);
        studentsList.setAdapter(adapter);
        studentsList.setOnItemClickListener((parent, view, position, id) -> getItem(position));
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
        groupName = findViewById(R.id.groupname);
        if (groupName != null) groupName.setText(group.getTitle());
    }
}
