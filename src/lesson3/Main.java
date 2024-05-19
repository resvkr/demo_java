package lesson3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + 1);
        }
        System.out.println(list);


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 1) {
                list.set(i, list.get(i) * 2);
            }
        }
        System.out.println(list);
        ArrayList<Integer> temp = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 6 == 0) {
                temp.add(list.get(i));
            }
        }

        list.removeAll(temp);


        System.out.println(list);
    }
}
