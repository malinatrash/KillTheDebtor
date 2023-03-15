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

public class DisciplinesListViewController extends AppCompatActivity {
    private ListView disciplinesList;
    private TextView teacherName;
    private Teacher teacher;
    private List<Discipline> disciplines = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disciplines_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
        disciplinesList = findViewById(R.id.disciplinesList);
        getTeacher();
        System.out.println(disciplines != null);

        DisciplineAdapter adapter = new DisciplineAdapter(this, disciplines);
        disciplinesList.setAdapter(adapter);
    }
    private void getTeacher() {
        Bundle arguments = getIntent().getExtras();
        if(arguments != null) teacher = (Teacher) arguments.getSerializable(Teacher.class.getSimpleName());
        setTeacherName();
        disciplines = teacher.getDisciplines();
    }
    private void setTeacherName() {
        teacherName = findViewById(R.id.teacherName);
        teacherName.setText(String.format("%s %s", teacher.getFirstname(), teacher.getLastname()));
    }
}