package com.ejercicioTEMA6.FinalExercise;

import java.io.*;
import java.util.*;

public class Registro {

    public static void users() throws FileNotFoundException, IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un Nombre: ");
        String nombre = scanner.next();

        System.out.print("Introduce un Apellido: ");
        String apellido = scanner.next();

        HashMap<String, String> mapa = new HashMap<>();
        mapa.put("nombre", nombre);
        mapa.put("apellido", apellido);

        System.out.println(mapa);

        try {
            PrintStream newfile = new PrintStream("registro.txt");
            newfile.write(String.valueOf(mapa).getBytes());
            newfile.close();

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }
}
