package lesson3.Homework;

import java.util.AbstractList;
import java.util.ArrayList;

public class Notes {
    AbstractList<String> notebook = new ArrayList<>();

    void addNote(String note) {
        notebook.add(note);
        System.out.println("Note added");
    }

    void removeNote(int num) {
        notebook.remove(num - 1);
        System.out.println("Note removed");
    }


    void showNotes() {
        for (int i = 0; i < notebook.size(); i++) {
            System.out.println((i + 1) + ") " + notebook.get(i));
        }
    }
}
