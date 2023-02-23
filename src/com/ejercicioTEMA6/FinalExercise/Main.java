package com.ejercicioTEMA6.FinalExercise;
import static com.ejercicioTEMA6.FinalExercise.Registro.users;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            users();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        } catch ( IOException e) {
            throw new RuntimeException(e);
        }
    }



}
