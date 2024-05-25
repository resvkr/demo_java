package lesson4;

import java.util.ArrayList;

// could you use some keywords to make this class more secured?
public class Customer {
    ArrayList<Pizza> order = new ArrayList<>();

    void makeOrder(Pizza pizza) {
        order.add(pizza);
    }

    // why not to use some method we have to show that what will be baked?
    void confirmOrder() {
        for (Pizza pizza : order) {
            System.out.println(pizza);
        }
        order.clear();
    }
}
