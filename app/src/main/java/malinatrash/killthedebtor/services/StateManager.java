package malinatrash.killthedebtor.services;

import java.util.ArrayList;

import malinatrash.killthedebtor.models.AcademicPerformance;
import malinatrash.killthedebtor.models.Discipline;
import malinatrash.killthedebtor.models.Group;
import malinatrash.killthedebtor.models.Student;
import malinatrash.killthedebtor.models.Teacher;

public class StateManager {
    public static StateManager shared = new StateManager();
    public Teacher currentTeacher;
    public Discipline currentDiscipline;
    public Group currentGroup;
    public Student currentStudent;

    StateManager() {
    }

    public Discipline getCurrentDiscipline() {
        return currentDiscipline;
    }

    public void setCurrentDiscipline(Discipline discipline) {
        this.currentDiscipline = discipline;
    }

    public Group getCurrentGroup() {
        return currentGroup;
    }

    public void setCurrentGroup(Group currentGroup) {
        this.currentGroup = currentGroup;
    }

    public Student getCurrentStudent() {
        return currentStudent;
    }

    public void setCurrentStudent(Student currentStudent) {
        this.currentStudent = currentStudent;
    }

    public Teacher getCurrentTeacher() {
        return currentTeacher;
    }

    public void setCurrentTeacher(Teacher currentTeacher) {
        this.currentTeacher = currentTeacher;
    }

    public int getCountDebts(ArrayList<AcademicPerformance> academicPerformances) {
        return getAcademicPerformance(academicPerformances).getCountDebts();
    }

    public String getGrade(ArrayList<AcademicPerformance> academicPerformances) {
        return getAcademicPerformance(academicPerformances).getGradeStr();
    }

    public boolean isDebtor(ArrayList<AcademicPerformance> academicPerformances) {
        return getAcademicPerformance(academicPerformances).debtsExists()
                && !getAcademicPerformance(academicPerformances).gradeIsOk();
    }

    public ArrayList getDebts(ArrayList<AcademicPerformance> academicPerformances) {
        return getAcademicPerformance(academicPerformances).getDebts();
    }

    public AcademicPerformance getAcademicPerformance(ArrayList<AcademicPerformance> academicPerformances) {
        for (AcademicPerformance academicPerformance : academicPerformances) {
            if (academicPerformance.getDisciplineTitle().equals(StateManager.shared.getCurrentDiscipline().getTitle())) {
                return academicPerformance;
            }
        }
        return null;
    }

    public int getCountDebtors(ArrayList<Student> students) {
        int count = 0;
        for (Student student : students) {
            if (isDebtor(student.getAcademicPerformances())) {
                count++;
            }
        }
        return count;
    }
}
