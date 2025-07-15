package danrusso.U5_W1_D2_Esercizio;

import danrusso.U5_W1_D2_Esercizio.entities.Menu;
import danrusso.U5_W1_D2_Esercizio.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    @Autowired
    Menu menu;

    @Autowired
    Order order;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(menu);
        System.out.println(order);
    }
}
