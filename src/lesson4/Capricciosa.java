package lesson4;


public class Capricciosa extends BasicPizza {


    private final boolean mushrooms = true;
    private boolean ham;

    public Capricciosa(boolean ham) {
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
