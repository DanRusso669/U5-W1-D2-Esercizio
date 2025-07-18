package danrusso.U5_W1_D2_Esercizio.entities;

public abstract class Item {
    protected String name;
    protected int calories;
    protected double price;

    public Item(String name, int calories, double price) {
        this.name = name;
        this.calories = calories;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }
}
