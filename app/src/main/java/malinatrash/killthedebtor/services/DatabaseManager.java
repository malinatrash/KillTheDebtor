package malinatrash.killthedebtor.services;

import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import malinatrash.killthedebtor.ViewControllers.LoginViewController;
import malinatrash.killthedebtor.models.AcademicPerformance;
import malinatrash.killthedebtor.models.Teacher;
import malinatrash.killthedebtor.models.fabrics.TeacherFabric;

public class DatabaseManager {
    public static DatabaseManager shared = new DatabaseManager();

    public DatabaseReference database = FirebaseDatabase.getInstance().getReference("teachers");
    private ArrayList<Teacher> teachers;

    public ArrayList<Teacher> getTeachers() {
        ArrayList<Teacher> teachers = new ArrayList<>();

        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot ds : snapshot.getChildren()) {
                    teachers.add(ds.getValue(Teacher.class));
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        };
        database.addValueEventListener(valueEventListener);
        return teachers;
    }

    public void sendTeachers() {
        TeacherFabric.shared.teachers.forEach(teacher -> {
            database.push().setValue(teacher);
        });
    }

    public void remove() {
        database.removeValue();
    }

    public void updateData() {
        remove();
        StateManager.shared.getTeachers().forEach(teacher -> {
            database.push().setValue(teacher);
        });
    }
}
