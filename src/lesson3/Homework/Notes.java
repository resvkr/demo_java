package lesson3.Homework;

import java.util.ArrayList;

public class Notes {
    ArrayList<Note> notebook = new ArrayList<>();

    void addNote(Note note) {
        notebook.add(note);
        System.out.println("Note added");
    }

    void removeNote(int num) {
        notebook.remove(num - 1);
        System.out.println("Note removed");
    }


    void showNotes() {
        for (int i = 0; i < notebook.size(); i++) {
            System.out.println((i + 1) + ") " + notebook.get(i).getTitle());
        }
    }

    void modifyNote(int num, Note note){
        notebook.set(num-1,note);
    }

    Note getNoteByIndex(int num){
        return notebook.get(num-1);
    }
}
