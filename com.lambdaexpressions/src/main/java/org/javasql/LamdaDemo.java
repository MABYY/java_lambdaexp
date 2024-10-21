package org.javasql;

public class LamdaDemo {

    public static void greet (Printer printer){
        printer.print("HELLO WORLD");
    }
    public static void show(){
        // Inner class:
        // Implement an IF only once and use it for
        // a single purpose

        // greet(new ConsolePrinter());

        // Now you could remove the ConsolePrinter class
        // and implement the functional IF inside the function

        greet( new Printer() {
            @Override
            public void print(String message) {
                System.out.println(message);
            };
        });
    }


}
