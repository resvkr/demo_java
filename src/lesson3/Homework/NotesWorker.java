package lesson3.Homework;

import java.util.Scanner;

public class NotesWorker {
    Notes notes;

    public NotesWorker(Notes notes) {
        this.notes = notes;
    }

    void start() {
        boolean whatToDo = true;
        while (whatToDo) {
            switch (actions()) {
                case "add" -> addOption();
                case "remove" -> removeOption();
                case "show" -> notes.showNotes();
                case "stop" -> whatToDo = false;
                default -> System.out.println("Wrong option");
            }
        }
    }

    String actions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                choices:
                add
                remove
                show
                What do you want to do?""");
        return scanner.nextLine();
    }

    void addOption() {
        System.out.println("Write note:");
        Scanner scanner = new Scanner(System.in);
        String note = scanner.nextLine();
        notes.addNote(note);
    }

    void removeOption() {
        notes.showNotes();
        System.out.println("Write number of note you want to remove");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        notes.removeNote(num);
    }
}
