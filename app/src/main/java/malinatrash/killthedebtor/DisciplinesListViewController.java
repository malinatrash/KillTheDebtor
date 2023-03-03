package malinatrash.killthedebtor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DisciplinesListViewController extends AppCompatActivity {
    private ListView disciplinesList;
    private TextView teacherName;
    private Teacher teacher;
    private List<String> disciplines = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplines_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
        getTeacher();
        disciplinesList = findViewById(R.id.disciplinesList);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                disciplines
        );
        disciplinesList.setAdapter(adapter);
    }
    private void getTeacher() {
        Bundle arguments = getIntent().getExtras();
        if(arguments != null) teacher = (Teacher) arguments.getSerializable(Teacher.class.getSimpleName());
        setTeacherName();
        parseDisciplines();
    }
    private void setTeacherName() {
        teacherName = findViewById(R.id.teacherName);
        teacherName.setText(String.format("%s %s", teacher.getFirstname(), teacher.getLastname()));
    }
    private void parseDisciplines() {
        for (Discipline discipline: teacher.getDisciplines()) {
            disciplines.add(discipline.getTitle());
        }
//        for (int i = 0; i < 15; i++) {
//            disciplines.add(String.valueOf(i));
//        }
    }
}