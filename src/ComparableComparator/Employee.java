package ComparableComparator;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

    int empId;
    String name;
    double salary;
    int age;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    Employee(int empId, String name, double salary, int age) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public int compareTo(Employee e) {
        return Double.compare(this.salary, e.salary);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empId == employee.empId;
    }

    @Override
    public int hashCode() {
        return empId;
    }
}
