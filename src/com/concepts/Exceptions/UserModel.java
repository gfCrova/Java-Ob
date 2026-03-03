package com.concepts.Exceptions;

public class UserModel {

    protected String name;
    protected String lastname;
    private int age;

    public UserModel() {
    }

    public UserModel(String name, int age, String lastname) {
        this.name = name;
        this.age = age;
        this.lastname = lastname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
