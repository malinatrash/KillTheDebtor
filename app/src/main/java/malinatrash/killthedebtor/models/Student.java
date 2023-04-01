package malinatrash.killthedebtor.models;

import static malinatrash.killthedebtor.models.AcademicPerformance.CSharp;
import static malinatrash.killthedebtor.models.AcademicPerformance.OOP;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import malinatrash.killthedebtor.services.StateManager;

public class Student implements Serializable {
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
    private final String firstname;
    private final String lastname;
    private final ArrayList<AcademicPerformance> academicPerformances;

    public Student(String firstname, String lastname, ArrayList<AcademicPerformance> academicPerformances) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.academicPerformances = academicPerformances;
    }

    public String getFirstname() {
        return firstname;
    }

    public AcademicPerformance getAcademicPerfomance() {
        for (AcademicPerformance academicPerformance : academicPerformances) {
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
        return getAcademicPerfomance().getGradeStr();
    }

    public boolean isDebtor() {
        return getAcademicPerfomance().debtsExists();
    }

    public List<Debt> getDebts() {
        return getAcademicPerfomance().getDebts();
    }

}
