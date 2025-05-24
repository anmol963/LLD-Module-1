package StateOfThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /*
        NEW RUNNABLE TERMINATED
        Thread t  = new Thread(new SimpleTask());
        System.out.println(t.getState());
        t.start();
        Thread.sleep(2000);
        System.out.println(t.getState());
         */

        /*
        Thread t1 = new Thread(new SimpleTask());
        Thread t2 = new Thread(new SimpleTask());

        t1.start();
        t2.start();

        System.out.println("t1 state: " + t1.getState());
        System.out.println("t2 state: " + t2.getState());
         */

        Thread t2 = new Thread(new SimpleTask2());
        t2.start();
        Thread.sleep(2000);
        System.out.println(t2.getState());
    }
}
