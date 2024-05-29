package lesson5.service;

import lesson5.entity.Duck;

public class BookOfDucks {
    private final Duck[] ducks;

    public BookOfDucks(Duck[] ducks) {
        this.ducks = ducks;
    }

    public void showDucks() {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
