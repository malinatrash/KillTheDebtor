package malinatrash.killthedebtor.models;

public class AcademicPerformance {
    private String disciplineTitle;
    private int grade;

    public AcademicPerformance(String disciplineTitle, int grade) {
        this.disciplineTitle = disciplineTitle;
        this.grade = grade;
    }
    public String getDisciplineTitle() {
        return disciplineTitle;
    }
    public void setDisciplineTitle(String disciplineTitle) {
        this.disciplineTitle = disciplineTitle;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
}

