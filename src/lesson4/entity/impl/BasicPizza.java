package lesson4.entity.impl;


import lesson4.entity.Pizza;

public class BasicPizza implements Pizza {
    private final boolean dough = true;

    public boolean containsDough() {
        return dough;
    }

    @Override
    public void bake() {
        System.out.println("Pizza is baked " + this);
    }

    @Override
    public String toString() {
        return "BasicPizza{" +
                "dough=" + this.dough +
                '}';
    }
}

