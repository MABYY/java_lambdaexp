package org.javasql;

public class LambdaDemoVC {
    public static String prefix = "----";

    //public String prefix2 = "----";
    // Access local variables in the enclosing method
    public static void show(){
        String prefixShow = "-";
        // Use a lambda expression to implement the IF
        // Implement the print fc in a standalone function
        greet(message -> {
            System.out.println(  prefix + message + prefixShow);
          //  System.out.println( this.prefix2 + prefix + message + prefixShow);
        });
    };

    public static void greet (Printer printer){
        printer.print("HELLO WORLD");
    }

}

