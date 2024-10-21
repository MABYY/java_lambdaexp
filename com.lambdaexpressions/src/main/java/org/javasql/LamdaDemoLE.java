package org.javasql;

public class LamdaDemoLE {

    public static void greet (Printer printer){
        printer.print("HELLO WORLD");
    }
    public static void show(){

        // Use a lambda expression to implement the IF
        // Implement the print fc in a standalone function
        greet(System.out::println);

//        greet((String message)-> {
//            System.out.println(message);
//        });
        // Implementations of the functional IF using
        // anonymous inner classes

//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            };
//        });
    }
}
