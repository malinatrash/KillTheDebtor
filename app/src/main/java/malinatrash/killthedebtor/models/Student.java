package malinatrash.killthedebtor.models;

import static malinatrash.killthedebtor.models.AcademicPerformance.CSharp;
import static malinatrash.killthedebtor.models.AcademicPerformance.OOP;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import malinatrash.killthedebtor.services.StateManager;

public class Student implements Serializable {
    private final String firstname;
    private final String lastname;
    private ArrayList<AcademicPerformance> academicPerformances;
    public Student(String firstname, String lastname, ArrayList<AcademicPerformance> academicPerformances) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.academicPerformances = academicPerformances;
    }

    public String getFirstname() {
        return firstname;
    }

    private AcademicPerformance getAcademicPerfomance() {
        for (AcademicPerformance academicPerformance: academicPerformances) {
            if (academicPerformance.getDisciplineTitle().equals(StateManager.shared.getCurrentDiscipline().getTitle())) {
                return academicPerformance;
            }
        }
        return null;
    }

    public String getLastname() {
        return lastname;
    }

    public int getCountDebts() {
        return getAcademicPerfomance().getCountDebts();
    }

    public String getGrade() {
        return getAcademicPerfomance().getGrade();
    }

    public boolean isDebtor() {
        for (AcademicPerformance academicPerformance: academicPerformances) {
            if (academicPerformance.getDisciplineTitle().equals(StateManager.shared.getCurrentDiscipline().getTitle())) {
                if (academicPerformance.debtsExists()) {
                    return true;
                }
            }
        }
        return false;
    }
    static ArrayList<AcademicPerformance> defaultAcademicPerformances = new ArrayList<>(Arrays.asList(OOP, CSharp));
    static ArrayList<Student> students = new ArrayList<>(
            Arrays.asList(
                new Student("Pavel", "Naumov", defaultAcademicPerformances),
                new Student("Dima", "Utka", defaultAcademicPerformances),
                new Student("Ayur", "Tapkharov", defaultAcademicPerformances),
                new Student("Kesha", "Dudar", defaultAcademicPerformances),
                new Student("Egor", "Aeropov", defaultAcademicPerformances),
                new Student("Erik", "Sokol", defaultAcademicPerformances),
                new Student("Boya", "Dimanov", defaultAcademicPerformances),
                new Student("Pavel", "Naumov", defaultAcademicPerformances),
                new Student("Dima", "Utka", defaultAcademicPerformances),
                new Student("Ayur", "Tapkharov", defaultAcademicPerformances),
                new Student("Kesha", "Dudar", defaultAcademicPerformances),
                new Student("Egor", "Aeropov", defaultAcademicPerformances),
                new Student("Erik", "Sokol", defaultAcademicPerformances),
                new Student("Boya", "Dimanov", defaultAcademicPerformances)
            )
    );

}
