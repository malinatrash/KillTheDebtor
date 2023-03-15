package malinatrash.killthedebtor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import malinatrash.killthedebtor.adapters.DisciplineAdapter;
import malinatrash.killthedebtor.adapters.GroupAdapter;

public class GroupsListViewController extends AppCompatActivity {
    private ListView groupsList;
    private TextView disciplineName;
    private Discipline discipline;
    private List<Group> groups = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_groups_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getDiscipline();
        groupsList = findViewById(R.id.groupsList);

        GroupAdapter adapter = new GroupAdapter(this, groups);
        groupsList.setAdapter(adapter);
        groupsList.setOnItemClickListener((parent, view, position, id) -> {});
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
    }
}