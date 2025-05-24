package ExecutorsAndCallables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class ArraySorter implements Callable<List<Integer>> {

    List<Integer> listToSort;
    ExecutorService es;

    ArraySorter(List<Integer> listToSort, ExecutorService es) {
        System.out.println(Thread.currentThread().getName());
        this.listToSort = listToSort;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(this.listToSort.size() == 1) {
            return this.listToSort;
        }
        int n = this.listToSort.size();

        List<Integer> leftArr = new ArrayList<>();
        for(int i=0; i<n/2; i++) {
            leftArr.add(this.listToSort.get(i));
        }
        List<Integer> rightArr = new ArrayList<>();
        for(int i=n/2; i<n; i++) {
            rightArr.add(this.listToSort.get(i));
        }

        ArraySorter leftArrSorter = new ArraySorter(leftArr, es);
        ArraySorter rightArrSorter = new ArraySorter(rightArr, es);

//        ExecutorService es = Executors.newCachedThreadPool();
        List<Integer> leftSortedArr =  es.submit(leftArrSorter).get();
        List<Integer> rightSortedArr = es.submit(rightArrSorter).get();

        return merge(leftSortedArr, rightSortedArr);
    }

    private List<Integer> merge(List<Integer> leftArr, List<Integer> rightArr) {
        List<Integer> res = new ArrayList<>();
        int i = 0;
        int j = 0;
        int n = leftArr.size();
        int m = rightArr.size();

        while (i < n && j < m) {
            if (leftArr.get(i) <= rightArr.get(j)) {
                res.add(leftArr.get(i));
                i++;
            } else {
                res.add(rightArr.get(j));
                j++;
            }
        }
        while (i < n) {
            res.add(leftArr.get(i));
            i++;
        }
        while (j < m) {
            res.add(rightArr.get(j));
            j++;
        }
        return res;
    }
}
