package malinatrash.killthedebtor.services;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import malinatrash.killthedebtor.models.Teacher;

public class LoginManager {
    public static LoginManager shared = new LoginManager();
    private Teacher teacher;

    public Teacher getTeacher(String login, String password) {
        List<Teacher> teachers = DatabaseManager.shared.getTeachers();
        for (Teacher t: teachers) {
            if (t.getLogin() == login && t.getPassword() == password) {
                return t;
            }
        }
        return null;
    }
}
