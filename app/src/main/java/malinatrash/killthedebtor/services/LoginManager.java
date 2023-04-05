package malinatrash.killthedebtor.services;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import malinatrash.killthedebtor.models.Teacher;
import malinatrash.killthedebtor.models.fabrics.TeacherFabric;

public class LoginManager {
    public static LoginManager shared = new LoginManager();

    public Teacher getTeacher(String login, String password) {
        for (Teacher t: StateManager.shared.getTeachers()) {
            if (t.getLogin().equals(login) && t.getPassword().equals(password)) {
                return t;
            }
        }
        return null;
    }
}
