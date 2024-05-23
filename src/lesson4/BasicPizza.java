package lesson4;

public class BasicPizza {
    String dough;
    String sauce;
    String meat;
    String cheese;

    public BasicPizza(String dough, String sauce, String meat, String cheese) {
        this.dough = dough;
        this.sauce = sauce;
        this.meat = meat;
        this.cheese = cheese;
    }

    public String toString() {
        String result = "";
        result += "\n" + dough;
        result += "\n" + sauce;
        result += "\n" + meat;
        result += "\n" + cheese;
        return result;
    }
}
