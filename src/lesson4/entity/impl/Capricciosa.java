package lesson4.entity.impl;


public class Capricciosa extends BasicPizza {


    private final boolean mushrooms = true;
    private final boolean ham;

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
