package lesson4;


public class Margherita extends BasicPizza {
    private final boolean tomatoes = true;

    private final boolean basil;

    public Margherita(boolean basil) {
        this.basil = basil;
    }

    @Override
    public String toString() {
        return "Margherita{" +
                "dough=" + containsDough() +
                ", tomatoes=" + tomatoes +
                ", basil=" + basil +
                '}';
    }
}
