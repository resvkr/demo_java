package lesson2;

public class Main {
    public static void main(String[] args) {
        Job job = new Job("cook", 18);
        Person person1 = new Person("Joe", "Taylor", 30, job);
        Person person2 = new Person("Bob", "Potter", 17, job);

        System.out.println(person1);
        System.out.println();
        System.out.println(person2);
    }
}
