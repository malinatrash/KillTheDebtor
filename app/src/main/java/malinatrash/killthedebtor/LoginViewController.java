package malinatrash.killthedebtor;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class LoginViewController extends AppCompatActivity {
    EditText loginField;
    EditText passwordField;
    Button signInButton;

    private Teacher teacher = new Teacher(
            "arsh",
            "pas",
            "Вадим",
            "Аршинский",
            new ArrayList<>(Arrays.asList(
                    new Discipline("ООП"),
                    new Discipline("Методы анализа данных"),
                    new Discipline("Операционные системы"),
                    new Discipline("Моделирование Процессов и систем"),
                    new Discipline("Анализ бизнес-процессов"),
                    new Discipline("Основы проектной деятельности"),
                    new Discipline("Иностранный язык"),
                    new Discipline("Технологии разработки программных комплексов"),
                    new Discipline("WEB-Программирование"),
                    new Discipline("ООП"),
                    new Discipline("Методы анализа данных"),
                    new Discipline("Операционные системы"),
                    new Discipline("Моделирование Процессов и систем"),
                    new Discipline("Анализ бизнес-процессов"),
                    new Discipline("Основы проектной деятельности"),
                    new Discipline("Иностранный язык"),
                    new Discipline("Технологии разработки программных комплексов"),
                    new Discipline("WEB-Программирование")
                    )));
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
        if (!isValidData()) {
            showAlertDialog();
            return;
        }
        navigateToDisciplinesList();
    }
    private void sendTeacher(Intent intent) {
        intent.putExtra(Teacher.class.getSimpleName(), teacher);
    }
    private void navigateToDisciplinesList() {
        Intent intent = new Intent(this, DisciplinesListViewController.class);
        sendTeacher(intent);
        startActivity(intent);
    }
    private boolean isValidData() {
        return loginField.getText().toString().equals("log") &&
                passwordField.getText().toString().equals("pas");
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