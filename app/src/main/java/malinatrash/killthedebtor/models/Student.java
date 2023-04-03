package malinatrash.killthedebtor.models;

import java.io.Serializable;
import java.util.ArrayList;

import malinatrash.killthedebtor.services.StateManager;

public class Student implements Serializable {
    private String firstname;
    private String lastname;
    private ArrayList<AcademicPerformance> academicPerformances;

    public Student(String firstname, String lastname, ArrayList<AcademicPerformance> academicPerformances) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.academicPerformances = academicPerformances;
    }

    public Student() {
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
        return getAcademicPerfomance().debtsExists() && !getAcademicPerfomance().gradeIsOk();
    }

    public ArrayList getDebts() {
        return getAcademicPerfomance().getDebts();
    }
}
