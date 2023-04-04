package malinatrash.killthedebtor.models;

public class Debt {
    private String description;
    private boolean isClosed;
    public Debt(boolean isClosed, String description) {
        this.isClosed = isClosed;
        this.description = description;
    }

    public Debt() {
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

    public void setDescription(String description) {
        this.description = description;
    }
}
