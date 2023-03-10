package malinatrash.killthedebtor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.Objects;

public class LoginViewController extends AppCompatActivity {
    EditText loginField;
    EditText passwordField;
    Button signInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setLayout();
        signInButton.setOnClickListener(view -> signInButtonPressed());
    }
    private void setLayout() {
        loginField = findViewById(R.id.loginField);
        passwordField = findViewById(R.id.passwordField);
        signInButton = findViewById(R.id.signInButton);
    }
    private void signInButtonPressed() {
        Teacher teacher = getTeacher();
        if (teacher == null) {
            showAlertDialog();
            return;
        }
        navigateToDisciplinesList(teacher);
    }
    private void sendTeacher(Intent intent, Teacher teacher) {
        intent.putExtra(Teacher.class.getSimpleName(), teacher);
    }
    private void navigateToDisciplinesList(Teacher teacher) {
        Intent intent = new Intent(this, DisciplinesListViewController.class);
        sendTeacher(intent, teacher);
        startActivity(intent);
    }
    private Teacher getTeacher() {
        return LoginManager.shared.getTeacher(loginField.getText().toString(), passwordField.getText().toString());
    }
    private void showAlertDialog() {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Ошибка");
        alert.setMessage("Неправильно введён логин или пароль");
        alert.setPositiveButton("Ок", (dialogInterface, i) -> {
            loginField.setText("");
            passwordField.setText("");
        });
        alert.create().show();
    }
}