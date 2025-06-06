package introtoprocessesandthreads;

public class NumberPrinter implements Runnable {

    int number;

    NumberPrinter(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Number " + number + " :" + Thread.currentThread().getName());
    }
}
