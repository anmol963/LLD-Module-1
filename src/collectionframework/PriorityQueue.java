package collectionframework;

import java.time.LocalDateTime;

public class PriorityQueue {
    public static void main(String[] args) {

        /*
        PriorityQueue<Task> pq = new PriorityQueue<>();
        pq.add(new Task("Send Email", 2, LocalDateTime.now()));
        pq.add(new Task("Update Logs", 1, LocalDateTime.now()));
        pq.add(new Task("Take a Walk", 3, LocalDateTime.now()));
        pq.add(new Task("Call Home", 5, LocalDateTime.now()));

        System.out.println("------------------Sorting in natural order--------------");
        pq.forEach(System.out::println);
        */

//        SortByTaskName sortByTaskName = new SortByTaskName();
//        Comparator<Task> comparator = new Comparator<Task>() {
//            public int compare(Task o1, Task o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        };
        java.util.PriorityQueue<Task> pq = new java.util.PriorityQueue<>((o1, o2) -> o1.name.compareTo(o2.name));
        pq.add(new Task("Send Email", 2, LocalDateTime.now()));
        pq.add(new Task("Update Logs", 1, LocalDateTime.now()));
        pq.add(new Task("Take a Walk", 3, LocalDateTime.now()));
        pq.add(new Task("Call Home", 5, LocalDateTime.now()));

        pq.forEach(System.out::println);
        System.out.println( pq.peek());
    }
}
