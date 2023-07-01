package com.zipcodewilmington.scientificcalculator;

public class Special extends Function {

    public static void main(String[] args) {
    }


    public static double getAbsValue(double inputA) {
        double result;
        result = Math.abs(inputA);
        return result;
    }

    public static double pythagoreanTheorem (double inputA, double inputB) {
        double result;
        result = Math.sqrt((inputA * inputA) + (inputB * inputB));
        return result;


    }
}
