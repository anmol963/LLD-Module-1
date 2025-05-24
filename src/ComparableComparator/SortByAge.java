package ComparableComparator;

import java.util.Comparator;

public class SortByAge implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.age, e2.age);
    }
}
