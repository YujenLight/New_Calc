package com.example.main;

import com.example.calculator.Calculator;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("5 - 3 = " + calculator.subtract(5, 3));
        System.out.println("5 * 3 = " + calculator.multiply(5, 3));
        System.out.println("6 / 3 = " + calculator.divide(6, 3));
    }
}

