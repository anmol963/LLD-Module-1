package introtoprocessesandthreads;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        // write the code that you want to execute from a separate thread
        System.out.println("Hello World. Thread name: " + Thread.currentThread().getName());
    }
}
