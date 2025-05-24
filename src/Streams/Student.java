package Streams;

public class Student {
    int age;
    double psp;
    String name;
    double attendance;

    Student(int age, double psp, String name, double attendance) {
        this.age = age;
        this.psp = psp;
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student [age=" + age + ", psp=" + psp + ", name=" + name + "]";
    }
}
