package com.patterns.behaviorPatterns.Iterator;

public class Usuario {
    String name;
    String lastname;
    int age;

    public Usuario() {
    }

    public Usuario(String name, String lastname, int age) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }
}
