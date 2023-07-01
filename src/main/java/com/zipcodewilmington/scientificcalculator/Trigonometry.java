package com.zipcodewilmington.scientificcalculator;

public class Trigonometry {

    public static void main(String[] args) {
    }

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


}
