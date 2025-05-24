package Streams;

import java.util.List;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {

        List<Integer> list = List.of(5,10, 2, 1, 16, 3, 8, 1, 2, 2);
        Stream<Integer> stream = list.stream();

//        stream.forEach((ele) -> {
//            System.out.println(ele);
//        }); // terminal operation

//        stream = stream.limit(4); // limit allows only first four data to flow
//        stream.forEach(System.out::println);

        // terminal and intermediate operations
        // intermediate: returns a stream back
        // terminal: terminate the stream

        list.stream().limit(4).forEach(System.out::println);
    }
}
