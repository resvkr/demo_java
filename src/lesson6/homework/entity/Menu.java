package lesson6.homework.entity;

public class Menu {
    private final double mainCourcePrice;
    private final double sideDishPrice;
    private final double dessertPrice;
    private final double drinkPrice;

    Menu() {
        this.mainCourcePrice = 20;
        this.sideDishPrice = 15;
        this.dessertPrice = 17;
        this.drinkPrice = 10;
    }

    public double getMainCourcePrice() {
        return mainCourcePrice;
    }

    public double getSideDishPrice() {
        return sideDishPrice;
    }

    public double getDessertPrice() {
        return dessertPrice;
    }

    public double getDrinkPrice() {
        return drinkPrice;
    }
}
