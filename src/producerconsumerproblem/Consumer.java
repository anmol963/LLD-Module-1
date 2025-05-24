package producerconsumerproblem;

import ProducerConsumerSemaphores.Store;

public class Consumer implements Runnable {

    private Store store;

    Consumer(Store st){
        this.store = st;
    }

    @Override
    public void run() {
        while(true) {
            synchronized (store) {
                if(!store.getItems().isEmpty()) {
                    store.removeItem();
                }
            }
        }
    }
}
