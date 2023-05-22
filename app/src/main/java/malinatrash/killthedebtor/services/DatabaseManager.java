package malinatrash.killthedebtor.services;

import androidx.annotation.NonNull;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import malinatrash.killthedebtor.models.Teacher;
import malinatrash.killthedebtor.models.fabrics.TeacherFabric;

public class DatabaseManager {
    public static DatabaseManager shared = new DatabaseManager();
    public DatabaseReference database = FirebaseDatabase.getInstance().getReference("teachers");

    public ArrayList<Teacher> getTeachers() {
        ArrayList<Teacher> teachers = new ArrayList<>();

        ValueEventListener valueEventListener = new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (!snapshot.exists()) {
                    initDatabase();
                }
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

    public void initDatabase() {
        TeacherFabric.shared.teachers.forEach(teacher -> {
            Map<String, Object> updates = new HashMap<>();
            updates.put(teacher.getLogin(), teacher);
            database.updateChildren(updates);
        });
    }

    public void updateData() {
        Map<String, Object> updates = new HashMap<>();
        updates.put(StateManager.shared.getCurrentTeacher().getLogin(), StateManager.shared.getCurrentTeacher());
        database.updateChildren(updates);
    }
}
