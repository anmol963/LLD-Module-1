package interfacesandabstract;

import java.util.Stack;

public interface Shape {

    int VAL = 3;

    void area(int a, int b);

    void perimeter(int a, int b);

    default void printShape() {
        System.out.println("Shape");
    }
}