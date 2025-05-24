package ExecutorsAndCallables;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // printing numbers from 1 to 100 via new threads
        /*
        for(int i=1; i<=100; i++) {
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
         */

        /*
        ExecutorService es = Executors.newFixedThreadPool(10);
        for(int i=1; i<=10000; i++) {
            if(i == 7001) {
                continue;
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            es.submit(numberPrinter);
        }
         */

        List<Integer> list = List.of(5,2,7,3,8,2,0,1);
        ExecutorService es = Executors.newFixedThreadPool(4);
        ListSorter sorter = new ListSorter(list, es);
        System.out.println(es.submit(sorter).get());
        es.shutdown();
    }
}
