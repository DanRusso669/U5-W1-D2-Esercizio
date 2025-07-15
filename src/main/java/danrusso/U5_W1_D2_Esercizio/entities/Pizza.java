package danrusso.U5_W1_D2_Esercizio.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Pizza extends Item {
    private String ingredients;


    public Pizza(String name, String ingredients, int calories, double price) {
        super(name, calories, price);
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return name +
                ", ingredients = " + ingredients +
                ", calories = " + calories +
                ", price = " + price +
                "$";
    }
}

