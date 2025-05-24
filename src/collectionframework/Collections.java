package collectionframework;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Collections {
    public static void main(String[] args) {
        // Collection: group of classes and interfaces which implement most famous data structures
        // List, Set and Queue

        // ----------------------------------------------------------------------------------------

        // List: Ordered collection, duplicates allowed, indexing allowed, random access
        // ArrayList: dynamic array, grow
        // random access O(1)
        // contagious memory required
        // not thread safe. Will have to make thread safe externally
        List<Integer> list = new ArrayList<>();

        // LinkedList: dynamic, grow
        // access : O(n)
        // non-contagious memory required
        // uses doubly linked list behind the scene
        // not thread safe
        List<Integer> linkedList = new LinkedList<>();

        // Vector : all properties similar to arraylist except vectors are thread safe
        // cons: it slows things down because of synchronized method
        // The 'Vector' class is considered a legacy class in Java, and while it is still supported, it is
        // generally not recommended for new code. For most applications, using ArrayList or other
        // modern collection classes from the JCF is preferred due to better performance, flexible design
        // and availability of advance concurrency utilities
        List<Integer> vector = new Vector<>();

        // stack and vector these two classes are used as legacy class
        // A more complete and consistent set of LIFO stack operations is
        // provided by the Deque interface and its implementations
        // Deque<Integer> stack = new ArrayDeque<Integer>();
        Stack<Integer> stack = new Stack<>();

        // ----------------------------------------------------------------------------------//
        // Set: no duplicates are allowed, generally not ordered, not thread safe
        // sets are famous for: fast lookup O(1)
        // Hashset internally uses HashMap, for value,  null is used
        Set<Integer> set = new HashSet<>();

        // hashset but maintains the order
        // behind the scene it uses LinkedHashmap; LRU cache problem
        // purpose: maintain the order and fast lookup
        Set<Integer> set2 = new LinkedHashSet<>();

        // TreeSet: maintains natural sorting order
        // its uses Balanced binary search tree behind the scene : AVL and Red Black : Red Black is used here
        // TC: for adding removing: O(log2n)
        // TreeSet uses TreeMap internally : TreeMap is a sorted HashMap where map is sorted based on key


        // ----------------------------------------------------------------------------------
        // Queue: A collection designed for holding elements prior to processing
        // Just like in Tree we do
        Queue<Integer> q = new PriorityQueue<>();

        // Deque: A linear collection that supports elements insertion and deletion at both ends
        // double ended queue. Can behave as a stack as well as queue
        // not thread safe
        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new LinkedList<>();

        // ---------------------------------------------------------------------------------
        // Map: key, Value. Map has two type parameter that's why it is not part of Collection Framework
        // HashMap: O(1)
        Map<Integer, Integer> map1 = new HashMap<>();

        // LinkedHashMap : DLL + HashMap
        //maintains the insertion order
        // TC: O(1). It requires extra space because we store every element twice
        Map<Integer, Integer> map2 = new LinkedHashMap<>();

        // TreeMap: maintains natural sorting order
        // TC for insertion and deletion: O(logn)
        Map<Integer, Integer> map3 = new TreeMap<>();

        // HashTable: everything similar to HashMap. Only difference is that HashTable is thread safe.
        // not recommended to use anymore
        // if a thread safe highly concurrent implementation is required, use ConcurrentHashMap in place of HashTable
        Map<Integer, Integer> map4 = new Hashtable<>();

        // ConcurrentHashMap: Thread safe variation of HashMap
        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        Set<Integer> keySet = map.keySet();
        for(Integer i : keySet) {
            System.out.println(map.get(i));
        }
    }
}
