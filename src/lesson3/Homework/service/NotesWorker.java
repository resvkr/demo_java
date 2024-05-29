package lesson3.Homework.service;

import lesson3.Homework.entity.Note;

import java.util.Scanner;

public class NotesWorker {
    private final Notes notes;

    public NotesWorker(Notes notes) {
        this.notes = notes;
    }

    public void start() {
        boolean whatToDo = true;
        while (whatToDo) {
            switch (actions()) {
                case "add" -> addOption();
                case "remove" -> removeOption();
                case "show" -> notes.showNotes();
                case "modify" -> modifyOption();
                case "get" -> getNote();
                case "stop" -> whatToDo = false;
                default -> System.out.println("Wrong option");
            }
        }
    }

    private String actions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                choices:
                add
                remove
                show
                modify
                get
                What do you want to do?""");
        return scanner.nextLine();
    }

    private void addOption() {
        notes.addNote(getNoteFromUser());
    }

    private void removeOption() {
        notes.showNotes();
        System.out.println("Write number of note you want to remove");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        notes.removeNote(num);
    }

    private void modifyOption() {
        Scanner scanner = new Scanner(System.in);
        notes.showNotes();

        System.out.println("Write number of note you want to modify:");
        int num = scanner.nextInt();
        System.out.println(notes.getNoteByIndex(num));
        notes.modifyNote(num, getNoteFromUser());
    }

    private Note getNoteFromUser() {
        System.out.println("Write title:");
        Scanner textscanner = new Scanner(System.in);
        String title = textscanner.nextLine();
        System.out.println("Write description:");
        String description = textscanner.nextLine();
        return new Note(title, description);
    }

    private void getNote() {
        System.out.println("Write number of note you watn to get:");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(notes.getNoteByIndex(num));
    }
}
