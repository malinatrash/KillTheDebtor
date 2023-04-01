package malinatrash.killthedebtor.models;

public class Debt {
    public static Debt debt1 = new Debt(false, "лаба 1");
    public static Debt debt2 = new Debt(false, "лаба 2");
    public static Debt debt3 = new Debt(true, "лаба 3");
    public static Debt debt4 = new Debt(false, "лаба 4");
    public static Debt debt5 = new Debt(true, "лаба 5");
    public static Debt debt6 = new Debt(false, "лаба 6");
    private final String description;
    private boolean isClosed;
    public Debt(boolean isClosed, String description) {
        this.isClosed = isClosed;
        this.description = description;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public void setClosed(boolean closed) {
        isClosed = closed;
    }

    public String getDescription() {
        return description;
    }
}
