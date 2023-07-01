package com.zipcodewilmington.scientificcalculator;

public class Function {

    // Arithmetic Functions
    public static double getSum (double inputA , double inputB) {
        double result = 0;

        result = inputA + inputB;

        return result;
    }

    public static double getSubtract (double inputA , double inputB) {

        double result = 0;

        result = inputA - inputB;

        return result;
    }

    public  static double getMultiply (double inputA , double inputB) {
        double result = 0 ;

        result = inputA * inputB;

        return result;
    }

    public  static double getDivide (double inputA , double inputB) {
        double result = 0 ;

        result = inputA / inputB;

        return  result;
    }

    // Exponential Functions
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

    // Trigonometry Functions

    public static double getSine(double inputA) {
        double result;
        result = Math.sin(inputA);
        return result;
    }

    public static double getCosine(double inputA) {
        double result;
        result = Math.cos(inputA);
        return result;
    }

    public static double getTangent(double inputA) {
        double result;
        result = Math.tan(inputA);
        return result;
    }

    public static double getInverseSine(double inputA) {
        double result;
        result = (1 / Math.cos(inputA));
        return result;
    }

    public static double getInverseCosine (double inputA) {
        double result;
        result = (1/ Math.cos(inputA));
        return result;
    }

    public static double getInverseTan(double inputA) {
        double result;
        result = (1/Math.tan(inputA));
        return result;
    }

    // Logarithmic Functions
    public static double getLN (double inputA) {

        double result = Math.log(inputA);
        return result;
    }

    public static double getLog10 (double inputA) {

        double result = Math.log10(inputA);
        return result;
    }

    // Special Functions

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
