package ExceptionHandling;

import java.sql.SQLException;

public class Client {
    public static void main(String[] args) {

//        try{
//            Student.doSomething(0);
//        }catch(IllegalAccessException e) {
//            System.out.println(e.getMessage());
//        }

        Student.doSomething(10);
    }
}
