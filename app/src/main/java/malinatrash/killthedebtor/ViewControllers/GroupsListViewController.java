package malinatrash.killthedebtor.ViewControllers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import malinatrash.killthedebtor.R;
import malinatrash.killthedebtor.adapters.GroupAdapter;
import malinatrash.killthedebtor.models.Discipline;
import malinatrash.killthedebtor.models.Group;

public class GroupsListViewController extends AppCompatActivity {
    private ListView groupsList;
    private TextView disciplineName;
    private List<Group> groups = new ArrayList<>();
    private Discipline discipline;
    private Group group;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getDiscipline();
        groupsList = findViewById(R.id.studentsList);

        GroupAdapter adapter = new GroupAdapter(this, groups);
        groupsList.setAdapter(adapter);
        groupsList.setOnItemClickListener((parent, view, position, id) -> getItem(position));
    }
    private void getDiscipline() {
        Bundle arguments = getIntent().getExtras();
        if(arguments != null) discipline = (Discipline) arguments.getSerializable(Discipline.class.getSimpleName());
        setDisciplineName();
        groups = discipline.getGroups();
    }
    private void setDisciplineName() {
        disciplineName = findViewById(R.id.disciplineName);
        if (disciplineName != null) disciplineName.setText(discipline.getTitle());
        System.out.println("\n\n\n\n\n");
        System.out.println(discipline.getTitle());
        System.out.println("\n\n\n\n\n");
    }
    private void getItem(int position) {
        group = groups.get(position);
        navigateToStudentsList();
    }
    private void navigateToStudentsList() {
        Intent intent = new Intent(this, StudentsListViewController.class);
        sendGroup(intent);
        System.out.println(intent.describeContents());
        startActivity(intent);
    }
    private void sendGroup(Intent intent) {
        intent.putExtra(Group.class.getSimpleName(), group);
    }
}