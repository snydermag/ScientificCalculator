package com.zipcodewilmington.scientificcalculator;

public class Function {

//Arithmetic Functions
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

//    Exponential Functions

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

//    Trigonometry Functions

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

    public static double getLog (double inputA, double inputB){
        double x = inputA;
        double base = inputB;
        double result = Math.log(x) / Math.log(base);
        return result;
    }
    public static double getLN (double inputA) {

        double result = Math.log(inputA);
        return result;
    }

    public static double getLog10 (double inputA) {

        double result = Math.log10(inputA);
        return result;
    }

//     Special Functions

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

    public static void printArithmeticMenu() {
        System.out.format("A - Addition\n" );
        System.out.format("B - Subtraction\n");
        System.out.format("C - Multiplication\n");
        System.out.format("D - Division\n");
    }

    public static void  printExponentialMenu () {
        System.out.format("A - Square Root\n");
        System.out.format("B - Exponent\n");
        System.out.format("C - Inverse\n"); // ????
    }


    public static  void printTrigonometryMenu () {
        System.out.format("A - Sin \n");
        System.out.format("B - Cosine\n");
        System.out.format("C - Tangent\n");
        System.out.format("D - Inverse Sin\n");
        System.out.format("E - Inverse Cosine\n");
        System.out.format("F - Inverse Tangent\n");
    }

    public static void printLogarithmicMenu () {
        System.out.format("A - LN\n");
        System.out.format("B - Log10\n");
    }

    public static void printSpecialFunctionsMenu () {
        System.out.format("A - Absolute Value\n");
        System.out.format("B - Pythagorean Theorem\n");
    }

    public static double getFactorial (double inputA) {
        int i, result = 1;
        double number = inputA;
        for (i = 1; i <= number; i++) {
            result = result * i;
        }

        return result;


    }

}
