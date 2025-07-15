package danrusso.U5_W1_D2_Esercizio.entities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Order {
    private List<Item> elements;
    private int orderNo;
    private Table table;
    private OrderStatus status;
    private int customNo;
    private double time;
    private double bill;

    @Autowired
    public Order(@Qualifier("getOrderElements") List<Item> elements, @Qualifier("order number") int orderNo,
                 Table table,
                 OrderStatus status,
                 @Qualifier("customers number") int customNo,
                 @Qualifier("order time") double time,
                 @Qualifier("order bill") double bill) {

        this.elements = elements;
        this.orderNo = orderNo;
        this.table = table;
        this.status = status;
        this.customNo = customNo;
        this.time = time;
        this.bill = bill;
    }

    @Override
    public String toString() {
        System.out.println("Your order summary: ");
        elements.forEach(item -> System.out.println(item.getName()));
        return "Table number " + table.getNumber() + " \n" +
                "Status " + status + " \n" +
                "Customers number " + customNo + " \n" +
                "Order time " + time + " p.m. \n" +
                "Bill total " + bill + "$";
    }
}
