package interfacesandabstract;

public class Rectangle implements Shape{

    @Override
    public void area(int a, int b) {
        System.out.println("Area of Rectangle");
    }

    @Override
    public void perimeter(int a, int b) {
        System.out.println("Perimeter of Rectangle");
    }

    @Override
    public void printShape() {
        System.out.println("Printing Rectangle");
    }
}
