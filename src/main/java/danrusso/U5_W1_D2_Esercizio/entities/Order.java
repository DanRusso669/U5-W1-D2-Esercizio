package danrusso.U5_W1_D2_Esercizio.entities;

import java.util.List;

public class Order {
    private List<Item> elements;
    private int orderNo;
    private Table table;
    private OrderStatus status;
    private int customNo;
    private double time;
    private double coperto;


    public Order(List<Item> elements, int orderNo, Table table, OrderStatus status, int customNo, double time, double coperto) {
        this.elements = elements;
        this.orderNo = orderNo;
        this.table = table;
        this.status = status;
        this.customNo = customNo;
        this.time = time;
        this.coperto = coperto;
    }

    public double getBill() {
        double tot = this.elements.stream().mapToDouble(Item::getPrice).sum();
        return tot + (this.coperto * this.customNo);
    }

    @Override
    public String toString() {
        System.out.println("Your order summary: ");
        elements.forEach(item -> System.out.println(item.getName()));
        return "Table number " + table.getNumber() + " \n" +
                "Status " + status + " \n" +
                "Customers number " + customNo + " \n" +
                "Order time " + time + " p.m.";
    }
}
