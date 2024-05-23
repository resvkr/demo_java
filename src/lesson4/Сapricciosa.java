package lesson4;

public class Сapricciosa extends BasicPizza {
    String mushrooms;
    String artichokes;

    public Сapricciosa(String dough, String sauce, String meat, String cheese, String mushrooms, String artichokes) {
        super(dough, sauce, meat, cheese);
        this.mushrooms = mushrooms;
        this.artichokes = artichokes;
    }

    public String ingredients() {
        String result = "Сapricciosa is pizza with: ";
        result += toString();
        result += "\n" + mushrooms;
        result += "\n" + artichokes;
        return result;
    }
}
