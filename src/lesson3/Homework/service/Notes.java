package lesson3.Homework.service;

import lesson3.Homework.entity.Note;

import java.util.ArrayList;

public class Notes {
    private final ArrayList<Note> notebook = new ArrayList<>();

    public void addNote(Note note) {
        notebook.add(note);
        System.out.println("Note added");
    }

    public void removeNote(int num) {
        notebook.remove(num - 1);
        System.out.println("Note removed");
    }


    public void showNotes() {
        for (int i = 0; i < notebook.size(); i++) {
            System.out.println((i + 1) + ") " + notebook.get(i).getTitle());
        }
    }

    public void modifyNote(int num, Note note) {
        notebook.set(num - 1, note);
    }

    public Note getNoteByIndex(int num) {
        return notebook.get(num - 1);
    }
}
