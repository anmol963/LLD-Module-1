package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<Student>();
        list.add(new Student(23, 98.5, "Anmol", 78.5));
        list.add(new Student(25, 93.5, "Mohit", 88.5));
        list.add(new Student(21, 100, "Raunak", 89.5));
        list.add(new Student(29, 65, "Gukesh", 65));
        list.add(new Student(27, 78.6, "Virat", 82.4));

        list.stream().filter((s) -> s.psp >= 80).forEach(System.out::println);
        System.out.println("------------------------------------------------");

        List<Student> newList =  list.stream().filter(s -> s.age >= 25).collect(Collectors.toList());
        System.out.println(newList);
        System.out.println("-------------------------------------------------");

        List<Integer> l1 = List.of(5,10, 2, 1, 16, 3, 8, 1, 2, 2);
        l1.stream().filter(e -> e % 2 == 0).map(e -> 2 * e).forEach(e -> {
            System.out.print(e + " ");
        });
        System.out.println("--------------------------------------------------");

//        int count = (int)l1.stream().filter(e -> {
//            System.out.println("Inside Filter " + e);
//            return e % 2 == 0;
//        }).count();
//        System.out.println(count);

        Stream<Integer> countStream = l1.stream().map(e -> {
            System.out.println("Inside Map " + e);
            return e * e;
        });

        int count = (int)countStream.count();
        System.out.println(count);

        System.out.println("------------------------------------");
        List<Integer> l2 = List.of(50,10, 2, 1, 16, 3, 8, 1, 2, 2);
        Optional<Integer> optional = l2.stream().filter(e -> {
            System.out.println("Inside filter " + e);
            return e % 2 == 0;
        }).map(e -> {
            System.out.println("Inside map " + e);
            return e * e;

        }).findFirst();

        if(optional.isPresent()){
            System.out.println(optional.get());
        }

        System.out.println("-------------------Sorting Student by Age");
        list.stream().sorted((s1, s2) -> {
            return s1.age - s2.age;
        }).forEach(System.out::println);
        // Intermediate operations are of two types: Stateful and Stateless
        // data will be passed through all the stateless operations one by one
        // stateful operation will process all the data then further operations will be executed

        // reduce: terminal operation
        // converge whole stream into a single element based on some login
        System.out.println("---------------------------------------------");
        Integer res = l2.stream().reduce(0, (currSum, ele) -> {
            currSum = currSum + ele;
            return currSum;
        });
        System.out.println(res);

        Integer result = l2.stream().reduce(Integer.MIN_VALUE, (max, ele) -> {
            max = Math.max(max, ele);
            return max;
        });
        System.out.println(result);

        System.out.println("------------------Flat Map------------------");

        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(1,2,3),
                Arrays.asList(1,2,3));

        List<Integer> ans = listOfLists.stream().flatMap((ele) -> {
            return ele.stream().map(e -> e * e);
        }).toList();

        listOfLists.stream().flatMap((ele) -> {
            return ele.stream().map(e -> e * e);
        }).forEach(System.out::println);

        System.out.println(ans);
    }
}
