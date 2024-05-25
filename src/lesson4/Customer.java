package lesson4;

import java.util.ArrayList;

public class Customer {
    ArrayList<Pizza> order = new ArrayList<>();

    void makeOrder(Pizza pizza) {
        order.add(pizza);
    }

    void confirmOrder() {
        for (Pizza pizza : order) {
            System.out.println(pizza);
        }
        order.clear();
    }
}
