package lesson4;

public class Main {
    public static void main(String[] args) {
        Margherita margherita1 = new Margherita(true);
        Margherita margherita2 = new Margherita(false);
        Сapricciosa capricciosa1 = new Сapricciosa(true);
        Сapricciosa capricciosa2 = new Сapricciosa(false);

        Customer order = new Customer();

        order.makeOrder(margherita1);
        order.makeOrder(margherita2);
        order.makeOrder(capricciosa1);
        order.makeOrder(capricciosa2);

        order.confirmOrder();
    }
}
