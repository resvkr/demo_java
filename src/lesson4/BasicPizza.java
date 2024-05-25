package lesson4;


public class BasicPizza implements Pizza {
    private final boolean dough = true;

    public boolean containsDough() {
        return dough;
    }

    // this method should  show which pizza will be baked and with what ingredients
    @Override
    public void bake() {
        System.out.println("Pizza is baked" + dough);
    }

}
