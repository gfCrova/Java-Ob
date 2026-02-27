package com.ejercicioTEMA6;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Copia de ficheros utilizando InputStream y PrintStream
 */
public class Ficheros {

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
            byte[] datos = in.readAllBytes(); // Lee el contenido del fichero de entrada y lo almacena en un array de bytes.
            in.close(); // Cierra el flujo de entrada después de leer los datos.

            PrintStream out = new PrintStream(fileOut);
            out.write(datos); // Escribe el contenido del array de bytes en el fichero de salida utilizando PrintStream.
            out.close(); // Cierra el flujo de salida después de escribir los datos.

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
