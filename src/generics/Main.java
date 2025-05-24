package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Pair<Integer, String> pair = new Pair(12, "Hello");
//        pair.example(12, 13, "Hello");
//        System.out.println(pair.getSecond());

//        ArrayList list = new ArrayList();
//        list.add("Hello");
//        list.add(12);
//        list.forEach(System.out::println);
//
//        HashMap map = new HashMap();
//        map.put("India", 1);
//        map.put(2, "India");

//        Pair.doSomething(pair.getFirst(), pair.getSecond());
//        Pair.doSomething(12);

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Toby"));
        dogs.add(new Dog("Andy"));

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Tom"));
        animals.add(new Dog("Jerry"));
        animals.add(new Animal("Human"));

//        AnimalUtility.printAnimals(animals);
        // not allowed as List<Dog> is not a child of List<Animal>
//        AnimalUtility.printAnimals(dogs);
    }
}