package ExecutorsAndCallables;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class ListSorter implements Callable<List<Integer>> {

    private List<Integer> listToSort;
    private ExecutorService executor;

    ListSorter(List<Integer> listToSort, ExecutorService executor) {
        this.listToSort = listToSort;
        this.executor = executor;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(listToSort.size() == 1) {
            return listToSort;
        }

        int size = listToSort.size();
        int mid = size / 2;
        List<Integer> leftList = listToSort.subList(0, mid);
        List<Integer> rightList = listToSort.subList(mid, listToSort.size());

        List<Integer> leftSortedArr =  executor.submit(new ListSorter(leftList, executor)).get();
        List<Integer> rightSortedArr = executor.submit(new ListSorter(rightList, executor)).get();

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
