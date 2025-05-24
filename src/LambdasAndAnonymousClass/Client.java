package LambdasAndAnonymousClass;

public class Client {
    public static void main(String[] args) {

        // Anonymous Classes: can implement interfaces and classes
        SampleInterface si = new SampleInterface() {
            @Override
            public void fun() {
                System.out.println("fun");
            }
            @Override
            public void bun() {
                System.out.println("Bun");
            }
        };

        si.fun();
        si.bun();

        Student st = new Student(12, 12.7, "Anmol", 23.5) {

            @Override
            public void printStudent() {
                System.out.println("Anonymous Print Student");
                System.out.println(age);
            }
        };

        st.printStudent();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Run");
            }
        };
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello Run");
            }
        });

        // -----------------Lambdas ---------------------------------------------
        /*
        Before Lambdas: Create a class for the task. Implement runnable and override run method
        Create it's object and pass it to constructor of Thread class.
        Other way is to pass the anonymous class.
        Best way to use lambda expression since Runnable is a functional interface.
         */

        // Since we write only one function definition in lambda expressions that's why it only works
        // for Functional Interface
        Thread t3 = new Thread(() -> System.out.println(Thread.currentThread().getName() + " Hello Run"));
        t3.start();

        Runnable runnable = () -> System.out.println(Thread.currentThread().getName() + " Hello Runnable");
        Thread t4 = new Thread(runnable);
        t4.start();


        // ------------------------Streams-------------------------------
    }
}
