package generics;

import java.util.List;

public class AnimalUtility {

//    public static void printAnimals(List<Animal> animals) {
//        for(Animal animal : animals) {
//            System.out.println(animal.name);
//        }
//    }

    // generic method with upperbound on Animal class
    public static <T extends Animal> List<T> printAnimalsReturns(List<T> animals) {
        // Here T could be any datatype from animal to anything below animal
        // compiler does not know the data type that's why it does not allow us to add any object in the list
//        animals.add(new Animal("Lion"));
        for(Animal animal : animals) {

            System.out.println(animal.name);
        }
        return animals;
    }

//    public static  void printAnimals(List<? extends Animal> animals) {
//        animals.add(new Animal("Lion"));
//        for(Animal animal : animals) {
//            System.out.println(animal.name);
//        }
//    }
}
