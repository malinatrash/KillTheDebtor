package malinatrash.killthedebtor.models;

import java.util.ArrayList;

public class AcademicPerformance<T> {
    private final Measure measure;
    private final ArrayList<Debt> debts;
    private String disciplineTitle;
    private T grade;

    public AcademicPerformance(String disciplineTitle, ArrayList<Debt> debts, Measure measure) {
        this.disciplineTitle = disciplineTitle;
        this.debts = debts;
        this.measure = measure;
        this.grade = null;
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

    public boolean debtsExists() {
        for (Debt debt : debts) {
            if (!debt.isClosed()) {
                return true;
            }
        }
        return false;
    }
}

