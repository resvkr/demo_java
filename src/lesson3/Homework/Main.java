package lesson3.Homework;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

// play with ArrayList<String..>
// add notes to list:
// - ask user to add note
// - ask user to remove note
// - ask user if he wants to stop a program
// - method show all notes
public class Main {
    public static void main(String[] args) {
        AbstractList<String> notebook = new ArrayList<>();
        String whatToDo = "";
        while (!whatToDo.equals("stop")) {
            whatToDo = action();
            if (whatToDo.equals("add")) {
                System.out.println("Write note:");
                Scanner scanner = new Scanner(System.in);
                String note = scanner.nextLine();
                addNote(notebook, note);
            } else if (whatToDo.equals("remove")) {
                System.out.println("Write number of note you want to remove");
                Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
                removeNote(notebook, num);
            } else if (whatToDo.equals("show")) {
                showNotes(notebook);
            }
        }


    }

    static String action() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to do?");
        String action = scanner.nextLine();
        return action;
    }

    static void addNote(AbstractList<String> list, String note) {
        list.add(note);
        System.out.println("Note added");
    }

    static void removeNote(AbstractList<String> list, int num) {
        list.remove(num - 1);
        System.out.println("Note removed");
    }

    static void showNotes(AbstractList<String> list) {
        System.out.println(list);
    }
}
