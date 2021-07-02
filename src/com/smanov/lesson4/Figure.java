package com.smanov.lesson4;

public abstract class Figure implements Drawable{
    private String name;

    public abstract double calculatePerimeter();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
