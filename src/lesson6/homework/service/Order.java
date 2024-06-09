package lesson6.homework.service;

import lesson6.homework.entity.Menu;

public class Order extends Menu {
    private final int mainCourceAmount;
    private final int sideDishAmount;
    private final int dessertAmount;
    private final int drinkAmount;

    public Order(int mainCourceAmount, int sideDishAmount, int dessertAmount, int drinkAmount) {
        this.mainCourceAmount = mainCourceAmount;
        this.sideDishAmount = sideDishAmount;
        this.dessertAmount = dessertAmount;
        this.drinkAmount = drinkAmount;
    }

    public double orderPrice() {
        return getMainCourcePrice() * mainCourceAmount + getSideDishPrice() * sideDishAmount + getDessertPrice() * dessertAmount + getDrinkPrice() * drinkAmount;
    }

    public String showOrder() {
        return "Order{" +
                "mainCourcePrice=" + getMainCourcePrice() + " " + mainCourceAmount + " times" +
                ", sideDishPrice=" + getSideDishPrice() + " " + sideDishAmount + " times" +
                ", dessertPrice=" + getDessertPrice() + " " + dessertAmount + " times" +
                ", drinkPrice=" + getDrinkPrice() + " " + drinkAmount + " times" +
                '}';
    }
}
