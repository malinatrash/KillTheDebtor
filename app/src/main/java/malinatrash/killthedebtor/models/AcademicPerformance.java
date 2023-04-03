package malinatrash.killthedebtor.models;

import java.util.ArrayList;

public class AcademicPerformance<T> {
    private Measure measure;
    private ArrayList<Debt> debts;
    private String disciplineTitle;
    private T grade;

    public AcademicPerformance(String disciplineTitle, ArrayList<Debt> debts, Measure measure) {
        this.disciplineTitle = disciplineTitle;
        this.debts = debts;
        this.measure = measure;
        this.grade = null;
    }

    public AcademicPerformance() {
    }

    public String getDisciplineTitle() {
        return disciplineTitle;
    }

    public void setDisciplineTitle(String disciplineTitle) {
        this.disciplineTitle = disciplineTitle;
    }

    public Measure getMeasure() {
        return measure;
    }

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public int getCountDebts() {
        int count = 0;
        for (Debt debt : debts) {
            if (!debt.isClosed()) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Debt> getDebts() {
        return debts;
    }

    public void setDebts(ArrayList<Debt> debts) {
        this.debts = debts;
    }

    public T getGrade() {
        return grade;
    }

    public void setGrade(T grade) {
        this.grade = grade;
    }

    public String getGradeStr() {
        if (grade instanceof Integer) {
            return "Оценка: " + grade;
        } else if (grade instanceof Boolean) {
            if ((Boolean) grade) {
                return "Зачтено";
            } else {
                return "Не зачтено";
            }
        }
        return "Нет оценки";
    }

    public boolean gradeIsOk() {
        if (getGrade() instanceof Boolean) {
            return (Boolean) getGrade();
        } else if (getGrade() instanceof Integer) {
            if (getGrade() != null) {
                return ((Integer) getGrade()) > 2;
            }
        }
        return false;
    }

    public boolean debtsExists() {
        for (Debt debt : debts) {
            if (!debt.isClosed()) {
                return true;
            }
        }
        return false;
    }
}

