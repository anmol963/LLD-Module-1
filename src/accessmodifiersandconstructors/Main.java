package accessmodifiersandconstructors;

public class Main {
    public static void main(String[] args) {

        Address address = new Address(123, "13th Main", "Bangalore", "Karnataka", "560008");
        Student s1 = new Student("Anmol", 25, 71.5, "Aca-Sep", address);
        Student s2 = new Student(s1);
        s1.address.street = "Kodihalli";
        displayStudent(s1);
        System.out.println();
    }

    public static void displayStudent(Student student) {
        student = new Student();
        student.printStudent();
    }
}
