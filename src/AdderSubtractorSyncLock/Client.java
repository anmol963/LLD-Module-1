package AdderSubtractorSyncLock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Value v = new Value();
        Adder adder = new Adder(v);
        Subtractor subtractor = new Subtractor(v);

        ExecutorService es = Executors.newFixedThreadPool(2);
        Future<Void> futAdder = es.submit(adder);
        Future<Void> futSub = es.submit(subtractor);

        futAdder.get();
        futSub.get();

        System.out.println(v.value);
        es.shutdown();
    }
}
