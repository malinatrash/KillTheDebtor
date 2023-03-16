package malinatrash.killthedebtor.models;

public class Measurement<T> {
    String description;
    T measurement;
}

class Credit extends Measurement<Boolean> {
    public Credit(boolean isPassed) {
        this.measurement = isPassed;
        this.description = "Зачет";
    }
}

class Grade extends Measurement<Integer> {
    public Grade(int grade) {
        this.measurement = grade;
        this.description = "Оценка";
    }
}