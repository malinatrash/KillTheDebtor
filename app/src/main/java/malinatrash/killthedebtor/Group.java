package malinatrash.killthedebtor;

import java.io.Serializable;
import java.util.ArrayList;

public class Group implements Serializable {
    private String title;
    private ArrayList<Student> students;

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
}
