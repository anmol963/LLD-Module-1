package accessmodifiersandconstructors;

public class Student {

    String name;
    int age;
    double psp;
    String batch;
    Address address;

    Student() {
        // default constructor
        System.out.println("default constructor");
    }

    Student(String name, int age, double psp, String batch, Address address) {
        this.name = name;
        this.age = age;
        this.psp = psp;
        this.batch = batch;
        this.address = address;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batch = student.batch;
//        this.address = student.address;
        this.address = new Address(student.address.houseNumber, student.address.street, student.address.city, student.address.state, student.address.zip);
    }


    public void printStudent() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", psp=" + psp +
                ", batch='" + batch + '\'' +
                '}';
    }
}
