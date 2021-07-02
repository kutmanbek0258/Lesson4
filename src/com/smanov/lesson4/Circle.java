package com.smanov.lesson4;

public class Circle extends Figure {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(Math.PI * radius);
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFE0");
    }
}
