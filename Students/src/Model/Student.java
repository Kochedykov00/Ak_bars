package Model;

public class Student {

    private String fio;
    private int age;
    private String group;
    private double avg_score;


    public Student() {
    }

    public Student(String fio, int age, String group, double avg_score) {
        this.fio = fio;
        this.age = age;
        this.group = group;
        this.avg_score = avg_score;
    }



    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getAvg_score() {
        return avg_score;
    }

    public void setAvg_score(double avg_score) {
        this.avg_score = avg_score;
    }
}
