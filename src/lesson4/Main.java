package lesson4;

public class Main {

    // please try to use OOP as: Interface nameOfObject = new Implementation()
    public static void main(String[] args) {
        Pizza margherita1 = new Margherita(true);
        Pizza margherita2 = new Margherita(false);
        // it is not common to use Non ASCII symbols in code: C(укр) != C(en)
        Pizza capricciosa1 = new Capricciosa(true);
        Pizza capricciosa2 = new Capricciosa(false);


        Customer order = new Customer();

        order.makeOrder(margherita1);
        order.makeOrder(margherita2);
        order.makeOrder(capricciosa1);
        order.makeOrder(capricciosa2);
        order.makeOrder(new BasicPizza());

        order.confirmOrder();
    }
}
