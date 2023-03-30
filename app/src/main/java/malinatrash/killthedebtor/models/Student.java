package malinatrash.killthedebtor.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Student implements Serializable {
    private final String firstname;
    private final String lastname;
    private ArrayList<AcademicPerformance> academicPerformances = new ArrayList<>();
    public Student(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    static ArrayList<Student> students = new ArrayList<>(Arrays.asList(
            new Student("Pavel", "Naumov"),
            new Student("Dima", "Utka"),
            new Student("Ayur", "Tapkharov"),
            new Student("Kesha", "Dudar"),
            new Student("Egor", "Aeropov"),
            new Student("Erik", "Sokol"),
            new Student("Boya", "Dimanov"),
            new Student("Pavel", "Naumov"),
            new Student("Dima", "Utka"),
            new Student("Ayur", "Tapkharov"),
            new Student("Kesha", "Dudar"),
            new Student("Egor", "Aeropov"),
            new Student("Erik", "Sokol"),
            new Student("Boya", "Dimanov")
    ));
}
