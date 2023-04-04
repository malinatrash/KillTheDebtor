package malinatrash.killthedebtor.models;

public class Grade {
    int grade;
    boolean credit;
    Measure measure;

    public Grade(Measure measure) {
        this.measure = measure;
        if (measure.equals(Measure.CREDIT)) {
            boolean grade;
        } else {
            int grade;
        }
    }

    public Measure getMeasure() {
        return measure;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean getCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }
}
