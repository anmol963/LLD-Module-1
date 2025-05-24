package IntroToOops;

public class Student {

    int rollNumber;
    String name;
    String email;
    String batch;
    String contactNumber;

    Student(int rollNumber, String name, String email, String batch, String contactNumber) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.email = email;
        this.batch = batch;
        this.contactNumber = contactNumber;
    }

    public void display() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", batch='" + batch + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                '}';
    }
}
