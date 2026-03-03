package com.concepts.Exceptions;

public class Main {

    public static void main(String[] args) {
        Users listUsers = new Users();
        UserModel hernan = new UserModel("Hernan", 23, "Galindez");
        UserModel jorge = new UserModel("Jorge", 32, "Sosa");
        UserModel celeste = new UserModel("Celeste", 19, "Vazquez");
        UserModel hugo = new UserModel();

        try {
            listUsers.addAllUsers(hernan, jorge, celeste, hugo);
        } catch (UserException e) {
            System.out.println("Error when registering the user: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Error: Invalid argument. " + e.getMessage());
        }
    }
}
