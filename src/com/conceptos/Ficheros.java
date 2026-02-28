package com.conceptos;

import java.io.*;

/**
 * Copia de ficheros utilizando [ InputStream / PrintStream ] y [ BufferedInputStream / BufferedOutputStream ].
 */
public class Ficheros {

    public static void main(String[] args) throws IOException {

        try {
            copiaDeFicheros("C:\\Program Files\\WinRAR\\Rar.txt", "copia.txt");
        } catch (IOException e) {
            System.out.println("No se puede copiar el fichero");
        }

        copiaDeFicherosConBuffer("C:\\Program Files\\WinRAR\\Rar.txt", "copia2.txt");
    }

    // InputStream y PrintStream
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

    // BufferedInputStream
    public static void copiaDeFicherosConBuffer(String fileIn, String fileOut) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fileIn));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(fileOut));
        byte[] buffer = new byte[1024]; // Buffer para almacenar los datos leídos
        int bytesRead;
        while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
            bufferedOutputStream.write(buffer, 0, bytesRead); // Escribe los bytes leídos en el archivo de salida
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
}
