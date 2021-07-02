package com.smanov.lesson4;

public class Rectangle extends Figure{

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double calculatePerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFE9");
    }
}
