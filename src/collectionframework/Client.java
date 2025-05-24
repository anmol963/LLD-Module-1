package collectionframework;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Client {
    public static void main(String[] args) {

        Comparator<Task> taskComparator = (t1, t2) -> {
            if(t1.priority != t2.priority) {
                return Integer.compare(t1.priority, t2.priority);
            }else {
                return t1.timestamp.compareTo(t2.timestamp);
            }
        };

        PriorityQueue<Task> queue = new PriorityQueue<>(taskComparator);
        queue.add(new Task("Email Server", 2, LocalDateTime.now()));
        queue.add(new Task("Calculator", 1, LocalDateTime.now()));
        queue.add(new Task("Camera", 3, LocalDateTime.now()));

        while(!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
