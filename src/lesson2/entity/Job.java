package lesson2.entity;

public class Job {
    String jobTitle;
    int starterAge;

    public Job(String jobTitle, int starterAge) {
        this.jobTitle = jobTitle;
        this.starterAge = starterAge;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public boolean isParticipantIsReadyForWork(int age) {
        return starterAge <= age;
    }

    public String toString() {
        String result = "";
        result += " Job title: " + jobTitle;
        result += "\n Starter age: " + starterAge;
        return result;
    }
}
