package com.zipcodewilmington.scientificcalculator;

public class Arithmetic extends Function {
    public static void main(String[] args) {

    }
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


}
