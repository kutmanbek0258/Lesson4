package com.smanov.lesson4.animal;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDC15");
    }

    @Override
    public void cllSound() {
        System.out.println("Gav gav");
    }
}
