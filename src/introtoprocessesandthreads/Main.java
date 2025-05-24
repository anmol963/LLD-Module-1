package introtoprocessesandthreads;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello World. Thread name: " + Thread.currentThread().getName());
        HelloWorldPrinter p = new HelloWorldPrinter();
        Thread t1 = new Thread(p);
        t1.start();
        System.out.println("Hello World. Thread name: " + Thread.currentThread().getName());
        Thread t2 = new Thread(p);
        t2.start();
         */

        // print numbers from 1 to 100, each from a different thread
        for(int i=1; i<=100; i++) {
            NumberPrinter printer = new NumberPrinter(i);
            Thread thread = new Thread(printer);
            thread.start();
        }
        System.out.println("Main Thread");
    }
}


/*
Task: print hello world from new thread
1. Create a task
    -> Create a class for the task
    -> Make this class implement Runnable interface
    -> Implement the run() method
2. Create a thread
    -> Create the thread object
3. Assign the task to the thread
    -> Pass task object to the constructor of the Thread class
4. Start the thread
    -> t.start()
 */