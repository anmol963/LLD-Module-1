package StateOfThread;

public class SimpleTask2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Simple Task 2");
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
