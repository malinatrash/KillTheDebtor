package malinatrash.killthedebtor.services;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;

import malinatrash.killthedebtor.models.Teacher;

public class LoginManager {
    public static LoginManager shared = new LoginManager();
    private Teacher teacher;

    public Teacher getTeacher(DatabaseReference database, String login, String password) {
        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds : snapshot.getChildren()) {
                    Teacher checkingTeacher = ds.getValue(Teacher.class);
                    if (checkingTeacher.getLogin().equals(login) && checkingTeacher.getPassword().equals(password)) {
                        teacher = checkingTeacher;
                        System.out.println("\n\n\n\n\n");
                        System.out.println(checkingTeacher.getLogin());
                        System.out.println("\n\n\n\n\n");
                    }
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        };
        database.addValueEventListener(valueEventListener);
        return teacher;
    }
}
