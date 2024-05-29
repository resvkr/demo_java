package lesson4;


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

