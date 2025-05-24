package ExceptionHandling;

import java.sql.SQLException;

public class Student {

    static void doSomething(int x)  {
//        if(x == 0) {
//            throw new ClassCastException();
//        }else if(x == 1) {
//            throw new ArithmeticException();
//        }else if(x == 2) {
//            throw new SQLException();
//        }else if(x == 3) {
//            throw new NullPointerException();
//        }else if(x == 4) {
//            throw new IllegalAccessException();
//        }

//        try{
//            throw new IllegalAccessException("Exception caught gracefully");
//        }catch(IllegalAccessException e){
//            System.out.println(e.getMessage());
//        }

//        throw new IllegalAccessException("Exception thrown");

        /*
        try {
            int a = 5;
            int b = 5 / 0;
            int[] arr ={1, 2, 3, 4, 5};
            System.out.println(arr[3]);
        }catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch(NullPointerException e) {
            System.out.println(e.getMessage());
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
         */
//        try {
//            throw new RandomException("Random Exception");
//        }catch (RandomException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            throw new CustomException("Custom Exception thrown");
//        }catch(CustomException e) {
//            System.out.println(e.getMessage());
//        }

//        try {
//            throw new StackOverflowError("Stack Overflow");
//        }catch(Error e) {
//            System.out.println(e.getMessage());
//        }
//
//        throw new ClassCastException();

        try {
            int[] arr = {1, 2, 4};
//            System.out.println(x / 2);
            System.out.println(arr[5]);
            System.out.println("Hello from inside try block");
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of bounds");
        } finally {
            System.out.println("Finally block");
        }

        System.out.println("Hello from outside try block");
    }
    
}
