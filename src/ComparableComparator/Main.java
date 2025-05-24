package ComparableComparator;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee(100, "Aman", 23000, 24);
        Employee e2 = new Employee(100, "Alok", 24000, 32);
        Employee e3 = new Employee(83, "Ravi", 32000, 27);
        Employee e4 = new Employee(96, "Malli", 14000, 45);
        Employee e5 = new Employee(25, "Bishnu", 9000, 12);

        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        set.forEach(System.out::println);
    }
}
