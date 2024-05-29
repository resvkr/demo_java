package lesson5;

import lesson5.entity.Duck;
import lesson5.entity.impl.PekinDuck;
import lesson5.entity.impl.RunnerDuck;
import lesson5.entity.impl.WildMallardDuck;
import lesson5.service.BookOfDucks;

public class Main {
    public static void main(String[] args) {
        Duck runner = new RunnerDuck();
        Duck pekin = new PekinDuck();
        Duck mallard = new WildMallardDuck();

        Duck[] ducks = {runner, pekin, mallard};
        BookOfDucks book = new BookOfDucks(ducks);
        book.showDucks();
    }
}
