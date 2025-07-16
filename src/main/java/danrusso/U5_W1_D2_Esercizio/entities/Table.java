package danrusso.U5_W1_D2_Esercizio.entities;

public class Table {
    private int number;
    private int maxCapacity;
    private TableStatus status;

    public Table(int number, int maxCapacity, TableStatus status) {
        this.number = number;
        this.maxCapacity = maxCapacity;
        this.status = status;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public TableStatus getStatus() {
        return status;
    }

    public void setStatus(TableStatus status) {
        this.status = status;
    }
}
