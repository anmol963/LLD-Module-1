package collectionframework;

import java.util.Comparator;

public class SortByTaskName implements Comparator<Task> {

    @Override
    public int compare(Task t1, Task t2) {
        return t1.name.compareTo(t2.name);
    }
}
