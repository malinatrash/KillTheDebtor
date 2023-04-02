package malinatrash.killthedebtor.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import malinatrash.killthedebtor.services.StateManager;

public class Student implements Serializable {
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
