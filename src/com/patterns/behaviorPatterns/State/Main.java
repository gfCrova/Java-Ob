package com.patterns.behaviorPatterns.State;

public class Main {
    public static void main(String[] args) {

        Movil movil = new Movil();

        System.out.println(movil.openCamera());
        System.out.println(movil.takePhoto());
        System.out.println(movil.unlock());
        System.out.println(movil.openCamera());
        System.out.println(movil.takePhoto());
        System.out.println(movil.lock());
    }
}
