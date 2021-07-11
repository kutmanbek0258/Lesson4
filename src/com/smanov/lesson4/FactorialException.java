package com.smanov.lesson4;

public class FactorialException extends Exception{

    private int number;

    public FactorialException(String message, int number) {
        super(message);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
