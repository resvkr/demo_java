package lesson4.services;

import lesson4.entity.Pizza;

import java.util.ArrayList;

// could you use some keywords to make this class more secured?
public class OrderService {
    private final ArrayList<Pizza> order = new ArrayList<>();

    public void makeOrder(Pizza pizza) {
        order.add(pizza);
    }


    // why not to use some method we have to show that what will be baked?
    public void confirmOrder() {
        for (Pizza pizza : order) {
            pizza.bake();
        }
        order.clear();
    }
}
