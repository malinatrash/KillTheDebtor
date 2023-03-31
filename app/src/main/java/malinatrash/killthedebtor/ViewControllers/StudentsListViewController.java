package malinatrash.killthedebtor.ViewControllers;

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
    private List<Student> students = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getGroup();
        studentsList = findViewById(R.id.debtsList);

        StudentAdapter adapter = new StudentAdapter(this, students);
        studentsList.setAdapter(adapter);
        studentsList.setOnItemClickListener((parent, view, position, id) -> {});
    }
    private void getGroup() {
        group = StateManager.shared.getCurrentGroup();
        setGroupName();
        students = group.getStudents();
    }
    private void setGroupName() {
        groupName = findViewById(R.id.grouptitle);
        if (groupName != null) groupName.setText(group.getTitle());
    }
}
