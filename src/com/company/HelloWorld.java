package com.company;

public class HelloWorld {

    public static void main(String[] args) {

        String name2 = "Gustavo";
        String something = "This is a text";
        boolean check = true;

        // Function que return un text concat
        System.out.println(printName2(something));
        // Call a Function que no return nada
        printMyName(name2 + check);

        if(number1 < number2 && number2 < number3){
            System.out.println("Es menor");
        } else if(number3 < number2){
            System.out.println("No es menor");
        } else {
            System.out.println("Nada");
        }
    }


    // FUNCTION QUE NO RETURN NADA (VOID)
    public static void printMyName(String nam) {
        System.out.println(nam);
    }

    // FUNCTION QUE RETURN
    public static String printName2(String algo) {
        return algo + " concatenate.";
    }


    static int number1 = 10;
    static int number2 = 20;
    static int number3 = 30;


}
