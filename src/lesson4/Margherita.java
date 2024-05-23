package lesson4;

public class Margherita extends BasicPizza {
    String tomatoes;
    String basil;


    public Margherita(String dough, String sauce, String meat, String cheese, String tomatoes, String basil) {
        super(dough, sauce, meat, cheese);
        this.tomatoes = tomatoes;
        this.basil = basil;
    }

    public String ingredients() {
        String result = "Margherita is pizza with: ";
        result += toString();
        result += "\n" + tomatoes;
        result += "\n" + basil;
        return result;
    }
}
