package LambdasAndAnonymousClass;

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

    Student() {

    }

    public void printStudent() {
        System.out.println("Print Student");
    }
}
