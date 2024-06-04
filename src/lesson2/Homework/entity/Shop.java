package lesson2.Homework.entity;

public class Shop {
    int apples;
    int peaches;
    int bananas;

    public int getApples() {
        return apples;
    }

    public int getPeaches() {
        return peaches;
    }

    public int getBananas() {
        return bananas;
    }

    public Shop(int apples, int peaches, int bananas) {
        this.apples = apples;
        this.bananas = bananas;
        this.peaches = peaches;
    }

    public void withdrawProducts(int apples, int peaches, int bananas) {
        this.apples -= apples;
        this.peaches -= peaches;
        this.bananas -= bananas;
    }


    public String showAllProducts() {
        String result = "";
        result += "\n Apples: " + apples;
        result += "\n Peaches: " + peaches;
        result += "\n Bananas: " + bananas;
        return result;
    }
}
