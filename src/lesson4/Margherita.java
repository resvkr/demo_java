package lesson4;


public class Margherita extends BasicPizza {
    private final boolean tomatoes = true;

    // why don't you try to use some keywords here ;)
    private boolean basil;

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
