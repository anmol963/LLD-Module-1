package AdderSubtractorSyncMethod;

public class Value {
    public long value = 0;

    public synchronized void increment(int i) {
        value += i;
    }

    public synchronized void decrement(int i) {
        value -= i;
    }
}
