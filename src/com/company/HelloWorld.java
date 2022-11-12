package com.company;

public class HelloWorld {

    public static void main(String[] args) {

        String name2 = "Gustavo";
        boolean check = true;

        // Call a Function que no return nada
        printMyName(name2 + check);

        int number1 = 10;
        int number2 = 20;
        int number3 = 30;
        if (number1 == number2 && number2 < number3) {
            System.out.println("Todo Coincide");
        } else if (number3 > number2) {
            System.out.println("Number3 es mayor a Number2");
        } else {
            System.out.println("Nada");
        }

        int count = 0;
        while (count < 10) {
            System.out.println("Contador en: " + count);
            count++;
        }
    }

        // FUNCTION QUE NO RETURN NADA (VOID)
        public static void printMyName (String nam){
            System.out.println(nam);
        }

        // FUNCTION QUE RETURN
        public static String printName2 (String algo){
            return algo + " concatenate.";
        }


}
