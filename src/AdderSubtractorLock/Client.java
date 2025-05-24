package AdderSubtractorLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v = new Value();
        Lock lock = new ReentrantLock();
        Adder adder = new Adder(v, lock);
        Subtractor subtractor = new Subtractor(v, lock);

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Void> futAdder = es.submit(adder);
        Future<Void> futSub = es.submit(subtractor);

        futAdder.get();
        futSub.get();

        System.out.println(v.value);
        es.shutdown();
    }
}
