package com.conceptos.Clases;

public class HelloWorld {

    public static void main(String[] args) {

        int i = 1;
        String name2 = "Gustavo";
        boolean check = true;

        printMyName(name2 + " " + check + " " + i);
        System.out.println(printAlgo(check, name2));

        // If / Else  **************************************************++*
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


        // Bucle WHILE ****************************************************
        int count = 10;
        while (count >= 0) {
            System.out.println("Contador en: " + count);
            if (count == 16) {
                System.out.println("Ha Terminado antes de tiempo!!");
                break;
            }else if (count == 0) {
                System.out.println("Ha Terminado!!");
            }
            count--;
        }

    }

        // FUNCTION QUE NO RETURN NADA (VOID) ****************************
        public static void printMyName (String nam){
            System.out.println(nam);
        }

        // FUNCTION QUE RETURN ******************************************+
        public static String printAlgo (boolean algo, String algo2){
            return algo + " concatenate " + algo2;
        }


}
