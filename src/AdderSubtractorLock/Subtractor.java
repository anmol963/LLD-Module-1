package AdderSubtractorLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock;

    Subtractor(Value v, Lock lock){
        this.lock = lock;
        this.v = v;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100000;i++){
            lock.lock();
            this.v.value -= i;
            lock.unlock();
        }

        return null;
    }
}
