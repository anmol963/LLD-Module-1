package collectionframework;

import java.util.Comparator;

public class SortByTaskPriority implements Comparator<Task> {
    @Override
    public int compare(Task t1, Task t2) {
        if(t1.priority != t2.priority) {
            return Integer.compare(t1.priority, t2.priority);
        }else {
            return t1.timestamp.compareTo(t2.timestamp);
        }
    }
}
