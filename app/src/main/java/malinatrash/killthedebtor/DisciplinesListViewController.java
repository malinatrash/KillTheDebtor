package malinatrash.killthedebtor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DisciplinesListViewController extends AppCompatActivity {
    private ListView disciplinesList;
    private TextView teacherName;
    private Teacher teacher;
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
                getDisciplines()
        );
        disciplinesList.setAdapter(adapter);
    }
    private List<String> getDisciplines() {
//        List<Discipline> disciplines = teacher.getDisciplines();
//        return disciplines.stream().map(Discipline::getTitle).collect(Collectors.toList());
        return null;
    }
    private void getTeacher() {
        Bundle arguments = getIntent().getExtras();
        if(arguments != null){
            teacher = (Teacher) arguments.getSerializable(Teacher.class.getSimpleName());
            teacherName = findViewById(R.id.teacherName);
            teacherName.setText(String.format("%s %s", teacher.getFirstname(), teacher.getLastname()));
        }
    }
}