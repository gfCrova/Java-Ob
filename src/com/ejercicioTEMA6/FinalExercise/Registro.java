package com.ejercicioTEMA6.FinalExercise;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Registro {

    public static void users() throws FileNotFoundException, IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce un Nombre: ");
        String nombre = scanner.next();

        System.out.print("Introduce un Apellido: ");
        String apellido = scanner.next();

        ArrayList<String> usuarios = new ArrayList<String>();
        usuarios.add(nombre + ", " + apellido);

        LinkedList<String> listadoCopiado = new LinkedList<String>(usuarios);

        System.out.println(listadoCopiado);

        try {
            File file = new File("registro.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));

            for (String users : listadoCopiado) {
                bw.write(users);
            }
            bw.close();

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }
}
