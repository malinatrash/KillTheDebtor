package malinatrash.killthedebtor.models;

import static malinatrash.killthedebtor.models.Debt.debt1;
import static malinatrash.killthedebtor.models.Debt.debt2;
import static malinatrash.killthedebtor.models.Debt.debt3;
import static malinatrash.killthedebtor.models.Debt.debt4;
import static malinatrash.killthedebtor.models.Debt.debt5;
import static malinatrash.killthedebtor.models.Debt.debt6;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class AcademicPerformance<T> {
    private String disciplineTitle;
    private T grade = (T) "Нет оценки";
    private ArrayList<Debt> debts = new ArrayList<>();

    public AcademicPerformance(String disciplineTitle, ArrayList<Debt> debts) {
        this.disciplineTitle = disciplineTitle;
        this.debts = debts;
    }
    public String getDisciplineTitle() {
        return disciplineTitle;
    }
    public void setDisciplineTitle(String disciplineTitle) {
        this.disciplineTitle = disciplineTitle;
    }

    public int getCountDebts() {
        int count = 0;
        for (Debt debt: debts) {
            if (!debt.isClosed()) {
                count ++;
            }
        }
        return count;
    }

    public String getGrade() {
        if (grade instanceof Integer) {
            return "Оценка " + String.valueOf(grade);
        } else if (grade instanceof Boolean) {
            if ((Boolean) grade) {
                return "Зачтено";
            } else {
                return "Не зачтено";
            }
        }
        return (String) grade;
    }
    public boolean debtsExists() {
        for (Debt debt: debts) {
            if (!debt.isClosed()) {
                return true;
            }
        }
        return false;
    }
    public void setGrade(T grade) {
        this.grade = grade;
    }

    static AcademicPerformance<Integer> OOP = new AcademicPerformance<>(
            "Объектно- ориентированное программирование",
            new ArrayList<Debt>(Arrays.asList(
                    debt1,
                    debt2,
                    debt3,
                    debt4,
                    debt5,
                    debt6
            ))
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
            ))
    );
}

