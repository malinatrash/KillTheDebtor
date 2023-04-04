package malinatrash.killthedebtor.models;

import java.io.Serializable;
import java.util.ArrayList;

import malinatrash.killthedebtor.services.StateManager;

public class Student implements Serializable {
    private String firstname;
    private String lastname;
    private ArrayList<AcademicPerformance> academicPerformances;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public ArrayList<AcademicPerformance> getAcademicPerformances() {
        return academicPerformances;
    }

    public void setAcademicPerformances(ArrayList<AcademicPerformance> academicPerformances) {
        this.academicPerformances = academicPerformances;
    }


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

    public String getLastname() {
        return lastname;
    }

}
