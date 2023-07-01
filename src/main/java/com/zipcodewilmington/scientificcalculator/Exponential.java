package com.zipcodewilmington.scientificcalculator;

public class Exponential extends Function {

    public static void main(String[] args) {


    }

    public static double getSquareRoot(double inputA) {
        double result;

        result = Math.sqrt(inputA);

        return result;
    }

    public static double getSquare(double inputA) {
        double result;

        result = inputA * inputA;

        return result;
    }

    public static double getExponent(double inputA, double inputB){
        double result = 1;
        int i;

        for (i = 0; i < inputB; i++) {
            result *= inputA;
        }

        return result;
    }

    public static double getInverse(double inputA){
        double result;

        result = 1 / inputA;

        return result;
    }



}
