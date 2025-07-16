package danrusso.U5_W1_D2_Esercizio;

import danrusso.U5_W1_D2_Esercizio.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class Runner implements CommandLineRunner {

    @Autowired
    Menu menu;

    @Autowired
    @Qualifier("order1 items")
    List<Item> orderItems;

    @Autowired
    @Qualifier("table 10")
    Table table10;

    @Autowired
    @Qualifier("order bill")
    double billTotal;

    @Override
    public void run(String... args) throws Exception {

        System.out.println(menu);

        Order order1 = new Order(orderItems, 1, table10, OrderStatus.PROCESSING, 2, 20.40, billTotal);

        System.out.println(order1);
    }
}
