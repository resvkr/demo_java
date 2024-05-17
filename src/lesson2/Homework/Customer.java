package lesson2.Homework;

public class Customer {
    int applesCust;
    int peachesCust;
    int bananasCust;
    Shop shop;

    Customer(Shop shop) {
        this.shop = shop;
    }

    public void addBananasCust(int bananasCust) {
        int temp = bananasCust + this.bananasCust;
        if (temp < shop.getBananas()) {
            this.bananasCust += bananasCust;
        } else {
            System.out.println("Shop: " + shop.bananas + "< Customer order: " + temp);
        }
    }

    public void addPeachesCust(int peachesCust) {
        int temp = peachesCust + this.peachesCust;
        if (temp < shop.getPeaches()) {
            this.peachesCust += peachesCust;
        } else {
            System.out.println("Shop: " + shop.peaches + "< Customer order: " + temp);
        }
    }

    public void addApplesCust(int applesCust) {
        int temp = applesCust + this.applesCust;
        if (temp < shop.getApples()) {
            this.applesCust += applesCust;
        } else {
            System.out.println("Shop: " + shop.apples + "< Customer order: " + temp);
        }
    }

    void confirmOrder() {
        shop.withdrawProducts(applesCust, peachesCust, bananasCust);
        applesCust = 0;
        peachesCust = 0;
        bananasCust = 0;
    }

    public String showChosenProducts() {
        String result = "";
        result += "\n Apples: " + applesCust;
        result += "\n Peaches: " + peachesCust;
        result += "\n Bananas: " + bananasCust;
        return result;
    }

}
