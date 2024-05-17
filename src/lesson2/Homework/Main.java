package lesson2.Homework;

public class Main {
    public static void main(String[] args) {
        Shop metro = new Shop(10, 5, 2);

        System.out.println(metro.showAllProducts());
        System.out.println();

        Customer customer1 = new Customer(metro);
        customer1.addApplesCust(6);
        customer1.addApplesCust(3);
        customer1.addPeachesCust(3);
        customer1.addBananasCust(1);
        customer1.confirmOrder();
        System.out.println(customer1.showChosenProducts());
        System.out.println(metro.showAllProducts());


    }
}
