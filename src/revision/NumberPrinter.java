package revision;

import java.util.List;

public class NumberPrinter extends Thread{

    @Override
    public void run() {
        System.out.println("NumberPrinter started");
    }

    public static void doSomething(List<? extends Animal> animals) {
        System.out.println("Hello");
    }
}
