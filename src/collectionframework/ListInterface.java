package collectionframework;

import java.util.*;

public class ListInterface {
    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

//        System.out.println(stack.peek());
//        System.out.println(stack.pop());

        Set<Integer> set = new LinkedHashSet<>();
        set.add(4);
        set.add(1);
        set.add(2);
        set.add(8);

//        set.forEach(System.out::println);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.forEach(System.out::println);
    }
}
