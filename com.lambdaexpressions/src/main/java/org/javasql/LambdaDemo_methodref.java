package org.javasql;

public class LambdaDemo_methodref {
    public static void show(){
        greet(System.out::println); // Method reference
        greet((String message) -> {
            System.out.println(message);
        });
    }

    public static void greet (Printer printer){
        printer.print("HELLO WORLD");
    }
}

