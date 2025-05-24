package ProducerConsumerSemaphores;


import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {

    private Store store;
    private Semaphore producerSemaphore;
    private Semaphore consumerSemaphore;

    Consumer(Store store, Semaphore producerSemaphore, Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    @Override
    public void run() {
        while (true) {
            try {
                this.consumerSemaphore.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            this.store.removeItem();
            this.producerSemaphore.release();
        }
    }
}
