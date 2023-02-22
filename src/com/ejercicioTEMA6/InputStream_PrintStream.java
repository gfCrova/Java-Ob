package com.ejercicioTEMA6;

import java.io.*;

public class InputStream_PrintStream {

    public static void main(String[] args) {

        try {
            copiaDeFicheros("C:\\Program Files\\WinRAR\\Rar.txt", "copia.txt");
        } catch (IOException e) {
            System.out.println("No se puede copiar el fichero");
        }
    }

    public static void copiaDeFicheros(String fileIn, String fileOut) throws IOException {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datos = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datos);
            out.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
