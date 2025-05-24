package StateOfThread;

public class SimpleTask implements Runnable {

    @Override
    public void run() {
        Thread t2 = new Thread(new SimpleTask2());
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static synchronized void longComputation() {
        while(true) {
            // creating an infinite loop to simulate long computation task
        }
    }
}
