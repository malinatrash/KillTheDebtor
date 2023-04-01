package malinatrash.killthedebtor.models;

import static malinatrash.killthedebtor.models.Debt.debt1;
import static malinatrash.killthedebtor.models.Debt.debt2;
import static malinatrash.killthedebtor.models.Debt.debt3;
import static malinatrash.killthedebtor.models.Debt.debt4;
import static malinatrash.killthedebtor.models.Debt.debt5;
import static malinatrash.killthedebtor.models.Debt.debt6;

import java.util.ArrayList;
import java.util.Arrays;

public class AcademicPerformance<T> {
    static AcademicPerformance<Integer> OOP = new AcademicPerformance<>(
            "Объектно- ориентированное программирование",
            new ArrayList<Debt>(Arrays.asList(
                    debt1,
                    debt2,
                    debt3,
                    debt4,
                    debt5,
                    debt6
            )),
            Measure.EXAM
    );
    static AcademicPerformance<Integer> CSharp = new AcademicPerformance<>(
            "Технологии программирования",
            new ArrayList<Debt>(Arrays.asList(
                    debt1,
                    debt2,
                    debt3,
                    debt4,
                    debt5,
                    debt6
            )),
            Measure.CREDIT
    );
    private final Measure measure;
    private final ArrayList<Debt> debts;
    private String disciplineTitle;
    private T grade;

    public AcademicPerformance(String disciplineTitle, ArrayList<Debt> debts, Measure measure) {
        this.disciplineTitle = disciplineTitle;
        this.debts = debts;
        this.measure = measure;
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

