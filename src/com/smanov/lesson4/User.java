package com.smanov.lesson4;

public class User {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) throws IllegalNameException {
        if(name.length() > 20){
            throw new IllegalNameException("Слишком длинное имя");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if(age > 100){
            throw new IllegalAgeException("Возраст перевалил 100");
        }
        this.age = age;
    }
}
