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
import malinatrash.killthedebtor.adapters.GroupAdapter;
import malinatrash.killthedebtor.models.Discipline;
import malinatrash.killthedebtor.models.Group;
import malinatrash.killthedebtor.services.StateManager;

public class GroupsListViewController extends AppCompatActivity {
    private ListView groupsList;
    private TextView disciplineName;
    private GroupAdapter adapter;
    private List<Group> groups = new ArrayList<>();
    private Discipline discipline;
    private Group group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
        groupsList = findViewById(R.id.debtsList);
        getDiscipline();
        adapter = new GroupAdapter(this, groups);
        groupsList.setAdapter(adapter);
        groupsList.setOnItemClickListener((parent, view, position, id) -> getItem(position));
    }

    @Override
    protected void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }


    private void getItem(int position) {
        group = groups.get(position);
        navigateToStudentsList();
    }

    private void sendGroup() {
        StateManager.shared.setCurrentGroup(group);
    }

    private void navigateToStudentsList() {
        Intent intent = new Intent(this, StudentsListViewController.class);
        sendGroup();
        startActivity(intent);
    }

    private void getDiscipline() {
        discipline = StateManager.shared.getCurrentDiscipline();
        disciplineName = findViewById(R.id.disciplineName);
        disciplineName.setText(discipline.getTitle());
        groups = discipline.getGroups();
    }
}