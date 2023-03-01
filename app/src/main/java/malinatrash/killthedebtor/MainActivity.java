package malinatrash.killthedebtor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText loginField;
    EditText passwordField;
    Button signInButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setLayout();
        signInButton.setOnClickListener(view -> signInButtonPressed());
    }
    private void setLayout() {
        loginField = findViewById(R.id.loginField);
        passwordField = findViewById(R.id.passwordField);
        signInButton = findViewById(R.id.signInButton);
    }
    private void signInButtonPressed() {
        System.out.println("workd");
    }
}