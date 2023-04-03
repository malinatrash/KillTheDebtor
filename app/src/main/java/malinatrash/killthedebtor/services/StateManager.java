package malinatrash.killthedebtor.services;

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
    public AcademicPerformance currentAcademicPerformance;

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
        this.currentAcademicPerformance = currentStudent.getAcademicPerfomance();
    }

    public Teacher getCurrentTeacher() {
        return currentTeacher;
    }

    public void setCurrentTeacher(Teacher currentTeacher) {
        this.currentTeacher = currentTeacher;
    }
}
