package lesson4;

// learn about words:
//  - extend
//  keywords:
//  - private

// play with these words and show some examples
public class Main {
    public static void main(String[] args) {
        BasicPizza pizza = new BasicPizza("dough", "sauce", "meat", "cheese");
        Margherita margherita = new Margherita("dough", "sauce", "meat", "cheese", "tomatoes", "basil");
        System.out.println(margherita.ingredients());
        Сapricciosa сapricciosa = new Сapricciosa("dough", "sauce", "meat", "cheese", "mushrooms", "artichokes");
        System.out.println(сapricciosa.ingredients());
    }
}
