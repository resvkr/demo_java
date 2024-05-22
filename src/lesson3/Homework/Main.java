package lesson3.Homework;

// play with ArrayList<String..>
// add notes to list:
// - ask user to add note
// - ask user to remove note
// - ask user if he wants to stop a program
// - method show all notes
public class Main {
    public static void main(String[] args) {
        Notes notebook = new Notes();
        notebook.addNote("blabla");
        notebook.addNote("blabla");
        NotesWorker notesWorker = new NotesWorker(notebook);
        notesWorker.start();
    }
}
