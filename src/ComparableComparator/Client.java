package ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Employee e1 = new Employee(100, "Aman", 23000, 24);
        Employee e2 = new Employee(231, "Alok", 24000, 32);
        Employee e3 = new Employee(83, "Ravi", 32000, 27);
        Employee e4 = new Employee(96, "Malli", 14000, 45);
        Employee e5 = new Employee(25, "Bishnu", 9000, 12);

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        // sort by natural sorting order
        Collections.sort(list);
//        Collections.reverse(list);
        list.forEach(System.out::println);
        System.out.println();
        // sort by age using comparator
//        Collections.sort(list, new SortByAge());
        Collections.sort(list, (o1, o2) -> Integer.compare(o1.age, o2.age));
        list.forEach(System.out::println);

    }
}
