package com.patterns.behaviorPatterns.Strategy;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUsers implements IUsers {

    private final File file;

    public FileUsers() {
        String fileUser = "users.txt";
        file = new File(fileUser);
    }

    @Override
    public void create(String name) {
        try (PrintStream ps = new PrintStream(new FileOutputStream(file, true))) {
            ps.println(name);
        } catch (Exception e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }

    @Override
    public ArrayList<String> getAll() {
        ArrayList<String> usuarios = new ArrayList<>();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                usuarios.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
        return usuarios;
    }
}
