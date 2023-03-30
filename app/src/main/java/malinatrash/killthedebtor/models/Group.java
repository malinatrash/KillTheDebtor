package malinatrash.killthedebtor.models;

import java.io.Serializable;
import java.util.ArrayList;

import malinatrash.killthedebtor.models.Student;

public class Group implements Serializable {
    private final String title;
    private final ArrayList<Student> students;

    public Group(String title, ArrayList<Student> students) {
        this.title = title;
        this.students = students;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getTitle() {
        return title;
    }

    public static Group group = new Group("ИСТб-21-1", Student.students);
}
