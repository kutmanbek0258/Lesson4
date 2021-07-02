package com.smanov.lesson4;

public class Square extends Figure{

    private double allSides;

    public Square(double allSides) {
        this.allSides = allSides;
    }

    @Override
    public double calculatePerimeter() {
        return allSides * 4;
    }

    @Override
    public void draw() {
        System.out.println("\uD83D\uDFE9");
    }
}
