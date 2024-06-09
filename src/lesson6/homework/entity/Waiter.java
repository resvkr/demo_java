package lesson6.homework.entity;

import lesson6.homework.service.Order;

public class Waiter {
    private static double tip;

    public double getTip(Order order) {
        tip += order.orderPrice() * 10 / 100;
        return tip;
    }

    @Override
    public String toString() {
        return "Waiter tip:" + tip;
    }
}
