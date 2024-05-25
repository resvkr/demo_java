package lesson4;


public class Сapricciosa extends BasicPizza {

    private final boolean mushrooms = true;
    private boolean ham;

    public Сapricciosa(boolean ham) {
        this.ham = ham;
    }

    @Override
    public String toString() {
        return "Сapricciosa{" +
                "dough=" + containsDough() +
                ", mushrooms=" + mushrooms +
                ", ham=" + ham +
                '}';
    }
}
