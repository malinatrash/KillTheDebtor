package malinatrash.killthedebtor.models;

import java.util.ArrayList;

public class AcademicPerformance {
    private Measure measure;
    private ArrayList<Debt> debts;
    private String disciplineTitle;
    private Performance grade;

    public AcademicPerformance(String disciplineTitle, ArrayList<Debt> debts, Measure measure) {
        this.disciplineTitle = disciplineTitle;
        this.debts = debts;
        this.measure = measure;
        this.grade = new Performance(measure);
    }

    public void setPerformance(Performance grade) {
        this.grade = grade;
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

    public Performance getGrade() {
        return grade;
    }

    public void setCredit(Boolean credit) {
        this.grade.setCredit((credit));
    }

    public void setPerformance(int grade) {
        this.grade.setPerformance(grade);
    }

    public String getGradeStr() {
        if (grade.getMeasure().equals(Measure.EXAM)) {
            if (grade.getPerformance() == 0) {
                return "Нет оценки";
            }
            return "Оценка: " + grade.getPerformance();
        } else if (grade.getMeasure().equals(Measure.CREDIT)) {
            if (grade.getCredit()) {
                return "Зачтено";
            } else {
                return "Не зачтено";
            }
        }
        return "Нет оценки";
    }

    public boolean gradeIsOk() {
        if (getGrade().getMeasure().equals(Measure.CREDIT)) {
            return getGrade().getCredit();
        } else if (getGrade().getMeasure().equals(Measure.EXAM)) {
            if (getGrade() != null) {
                return (getGrade().getPerformance()) > 2;
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

