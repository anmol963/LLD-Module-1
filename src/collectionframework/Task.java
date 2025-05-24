package collectionframework;

import java.time.LocalDateTime;
import java.util.Comparator;

public class Task implements Comparable<Task>{

    String name;
    int priority;
    LocalDateTime timestamp;

    Task(String name, int priority, LocalDateTime timestamp) {
        this.name = name;
        this.priority = priority;
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Task [name=" + name + ", priority=" + priority + ", timestamp=" + timestamp + "]";
    }

    @Override
    public int compareTo(Task t) {
        if(this.priority < t.priority) {
            return -1;
        }else if(this.priority > t.priority) {
            return 1;
        }else {
            return 0;
        }
    }
}
