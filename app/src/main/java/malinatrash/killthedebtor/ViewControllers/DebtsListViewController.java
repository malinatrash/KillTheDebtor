package malinatrash.killthedebtor.ViewControllers;

import malinatrash.killthedebtor.R;
import malinatrash.killthedebtor.adapters.StudentAdapter;
import malinatrash.killthedebtor.models.Group;
import malinatrash.killthedebtor.models.Student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DebtsListViewController extends AppCompatActivity {
    private ListView debtsList;
    private TextView studentName;
    private Student student;
    private List<Student> debts = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debts_list_view_controller);
        Objects.requireNonNull(getSupportActionBar()).hide();
    }

}