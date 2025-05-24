package ProducerConsumerSemaphores;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {

    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Producer(Store st, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = st;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while(true) {
            try {
                this.producerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.store.addItem();
            this.consumerSemaphore.release();
        }
    }
}
