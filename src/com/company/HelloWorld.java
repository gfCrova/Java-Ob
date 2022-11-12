package com.company;

public class HelloWorld {

    public static void main(String[] args) {

        System.out.println("Hello World"); // commentary

        // Function que return un text concat
        System.out.println(printName2(something));
        // Call a Function que no return nada
        printMyName(name2);

    }
    static String name2 = "Gustavo";
    static String something = "This is a text";

    // FUNCTION QUE NO RETURN NADA (VOID)
    public static void printMyName(String nam) {
        System.out.println(nam);
    }

    // FUNCTION QUE RETURN
    public static String printName2(String algo) {
        return algo + " concatenate.";
    }
}
