package lesson3.Homework;

import lesson3.Homework.service.Notes;
import lesson3.Homework.service.NotesWorker;

// play with ArrayList<String..>
// add notes to list:
// - ask user to add note
// - ask user to remove note
// - ask user if he wants to stop a program
// - method show all notes
public class Main {
    public static void main(String[] args) {
        Notes notebook = new Notes();
        NotesWorker notesWorker = new NotesWorker(notebook);
        notesWorker.start();
    }
}
