package malinatrash.killthedebtor.ViewControllers;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Objects;

import malinatrash.killthedebtor.R;
import malinatrash.killthedebtor.models.Teacher;
import malinatrash.killthedebtor.models.fabrics.TeacherFabric;
import malinatrash.killthedebtor.services.StateManager;

public class LoginViewController extends AppCompatActivity {
    EditText loginField;
    EditText passwordField;
    Button signInButton;
    private DatabaseReference database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        initDatabase();
        setLayout();
        signInButton.setOnClickListener(view -> signInButtonPressed());
    }

    private void initDatabase() {
        database = FirebaseDatabase.getInstance().getReference();

//        database.push().setValue(LoginManager.shared.teachers);

        database.push().setValue(TeacherFabric.shared.getTeacherArsh());
        database.push().setValue(TeacherFabric.shared.getTeacherKatash());
        database.push().setValue(TeacherFabric.shared.getTeacherBuch());
        database.push().setValue(TeacherFabric.shared.getTeacherMalan());
        database.push().setValue(TeacherFabric.shared.getTeacherPetrov());
    }

    private void setLayout() {
        loginField = findViewById(R.id.loginField);
        passwordField = findViewById(R.id.passwordField);
        signInButton = findViewById(R.id.signInButton);
    }

    private void signInButtonPressed() {
        Teacher teacher = getTeacher();
        teacher = TeacherFabric.shared.getTeacherBuch();

        if (teacher == null) {
            showAlertDialog();
            return;
        }

        navigateToDisciplinesList(teacher);
    }

    private void sendTeacher(Teacher teacher) {
        StateManager.shared.setCurrentTeacher(teacher);
    }

    private void navigateToDisciplinesList(Teacher teacher) {
        Intent intent = new Intent(this, DisciplinesListViewController.class);
        sendTeacher(teacher);
        startActivity(intent);
    }

    private Teacher getTeacher() {
        return null;
//        return LoginManager.shared.getTeacher(
//                database,
//                loginField.getText().toString(),
//                passwordField.getText().toString()
//        );
    }

    private void clearFields() {
        loginField.setText("");
        passwordField.setText("");
    }

    private void showAlertDialog() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Ошибка!");
        alert.setMessage("Неправильно введён логин или пароль");
        alert.setPositiveButton("Ок", (dialogInterface, i) -> clearFields());
        alert.create().show();
    }
}