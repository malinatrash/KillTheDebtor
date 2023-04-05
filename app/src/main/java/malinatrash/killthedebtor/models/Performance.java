package malinatrash.killthedebtor.models;

public class Performance {
    int performance;
    boolean credit;
    Measure measure;

    public void setMeasure(Measure measure) {
        this.measure = measure;
    }

    public Performance(Measure measure) {
        this.measure = measure;
        if (measure.equals(Measure.CREDIT)) {
            boolean grade;
        } else {
            int grade;
        }
    }

    Performance(){}

    public Measure getMeasure() {
        return measure;
    }

    public int getPerformance() {
        return performance;
    }

    public void setPerformance(int performance) {
        this.performance = performance;
    }

    public boolean getCredit() {
        return credit;
    }

    public void setCredit(boolean credit) {
        this.credit = credit;
    }
}
