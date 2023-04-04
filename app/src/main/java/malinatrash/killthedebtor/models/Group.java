package malinatrash.killthedebtor.models;

import java.io.Serializable;
import java.util.ArrayList;

import malinatrash.killthedebtor.services.StateManager;

public class Group implements Serializable {
    private String title;
    private ArrayList<Student> students;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }


    public Group(String title, ArrayList<Student> students) {
        this.title = title;
        this.students = students;
    }

    public Group() {
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public String getTitle() {
        return title;
    }
}
