package inheritanceandpolymorphism;

public class D  extends C{
    String address;

    D() {

    }

    D(String phone) {
        super(phone); // super refers to the immediate parent class
        System.out.println("D constructor");
    }

    @Override
    void print(){
        System.out.println("Hello from D");
    }
}
