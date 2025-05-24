package AdderSubtractorAtomic;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {
    private Value v;

    Subtractor(Value v){
        this.v = v;
    }
    @Override
    public Void call() throws Exception {
        for(int i=1;i<=100000;i++){
            this.v.value.addAndGet(-i);
        }

        return null;
    }
}
