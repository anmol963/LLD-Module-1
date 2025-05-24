package collectionframework;

import java.time.LocalDateTime;

public class Task {

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
}
