package inheritanceandpolymorphism;

public class C extends B{
    String phone;

    C() {
        System.out.println("C constructor");
    }

    C(String phone) {
        this.phone = phone;
        System.out.println("C constructor");
    }

    void print(){
        System.out.println("Hello from C");
    }
}
