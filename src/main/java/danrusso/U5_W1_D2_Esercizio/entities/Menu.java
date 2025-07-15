package danrusso.U5_W1_D2_Esercizio.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component
public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        System.out.println("Menu");
        System.out.println("Pizzas");
        pizzas.forEach(System.out::println);
        System.out.println(" ");
        System.out.println("Toppings");
        toppings.forEach(System.out::println);
        System.out.println(" ");
        System.out.println("Drinks");
        drinks.forEach(System.out::println);
        System.out.println(" ");
        return "Good Evening";
    }
}
