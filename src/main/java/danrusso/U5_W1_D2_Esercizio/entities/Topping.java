package danrusso.U5_W1_D2_Esercizio.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Topping extends Item {

    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }

    @Override
    public String toString() {
        return name + ", calories = " + calories +
                ", price = " + price + "$";
    }
}
