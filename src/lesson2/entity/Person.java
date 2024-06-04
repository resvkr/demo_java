package lesson2.entity;

public class Person {
    String name;
    String surname;
    int age;
    Job job;

    public Person(String name, String surname, int age, Job job) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        setJob(job);
    }

    public void setJob(Job job) {
        if (job.isParticipantIsReadyForWork(age)) {
            this.job = job;
        } else {
            this.job = new Job("unemployment", 0);
        }
    }

    public String toString() {
        String result = "";
        result += " Name: " + name;
        result += "\n Surname: " + surname;
        result += "\n Age: " + age;
        result += "\n Job: " + job.getJobTitle();
        return result;
    }
}
