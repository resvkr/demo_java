package lesson6.homework;

import lesson6.homework.entity.Waiter;
import lesson6.homework.service.Order;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(3, 4, 5, 6);
        System.out.println(order1.showOrder());
        Waiter waiter = new Waiter();
        System.out.println(waiter.getTip(order1));
        Order order2 = new Order(1, 1, 1, 1);
        System.out.println(order2.showOrder());
        System.out.println(waiter.getTip(order2));
    }
}
