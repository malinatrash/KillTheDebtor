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
import malinatrash.killthedebtor.adapters.DisciplineAdapter;
import malinatrash.killthedebtor.models.Discipline;
import malinatrash.killthedebtor.models.Teacher;
import malinatrash.killthedebtor.services.StateManager;

public class DisciplinesListViewController extends AppCompatActivity {
    private ListView disciplinesList;
    private TextView teacherName;
    private Teacher teacher;
    private List<Discipline> disciplines = new ArrayList<>();
    private Discipline discipline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplines_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
        disciplinesList = findViewById(R.id.studentsList);
        render();
    }

    @Override
    protected void onResume() {
        super.onResume();
        render();
    }

    private void render() {
        getTeacher();
        DisciplineAdapter adapter = new DisciplineAdapter(this, disciplines);
        disciplinesList.setAdapter(adapter);
        disciplinesList.setOnItemClickListener((parent, view, position, id) -> getItem(position));
    }

    private void getItem(int position) {
        discipline = disciplines.get(position);
        navigateToGroupsList();
    }

    private void sendDiscipline() {
        StateManager.shared.setCurrentDiscipline(discipline);
    }

    private void navigateToGroupsList() {
        Intent intent = new Intent(this, GroupsListViewController.class);
        sendDiscipline();
        startActivity(intent);
    }

    private void getTeacher() {
        teacher = StateManager.shared.getCurrentTeacher();
        disciplines = teacher.getDisciplines();
        teacherName = findViewById(R.id.teacherName);
        teacherName.setText(String.format("%s %s", teacher.getFirstname(), teacher.getLastname()));
    }
}

