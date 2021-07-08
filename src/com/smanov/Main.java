package com.smanov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*int[] ints = new int[5];

        ints[4] = 13;

        try{
            System.out.println(ints[4]);
            System.out.println(ints[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Other");
        }

        System.out.println(getAreaOfSquare(5,5));
        System.out.println(getAreaOfSquare(5,-5));

        try {
            getFactorial(-5);
        } catch (FactorialException e) {
            System.out.println(e.getMessage() + e.getNumber());
        }

        Scanner scanner = new Scanner(System.in);

        User user = new User();

        while (true){
            try {
                System.out.println("Input name");
                user.setName(scanner.next());
                System.out.println("Input age");
                user.setAge(scanner.nextInt());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/

        try {
            System.out.println(9/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }


    }

    public static int getFactorial(int num) throws FactorialException {
        if(num <= 0) {
            throw new FactorialException("Out of exc", num);
        }
        int result = 1;
        for(int i = 1; i <= num; i++){
            result *= i;
            System.out.println(result);
        }
        return result;
    }

    public static int getAreaOfSquare(int x, int y){
        int area = 0;
        if(x < 0 || y <0){
            try {
                throw new IllegalArgumentException("Значения не могут быть отрицательными");
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

        }else {
            area = x * y;
        }
        return area;
    }
}
