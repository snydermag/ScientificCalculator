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
        result = (Math.asin(inputA));
        return result;
    }

    public static double getInverseCosine (double inputA) {
        double result;
        result = (Math.acos(inputA));
        return result;
    }

    public static double getInverseTan(double inputA) {
        double result;
        result = (Math.atan(inputA));
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

    // Special Functions

    public static double getAbsValue(double inputA) {
        double result;
        result = Math.abs(inputA);
        return result;
    }

    public static double getPythagoreanTheorem (double inputA, double inputB) {
        double result;
        result = Math.sqrt((inputA * inputA) + (inputB * inputB));
        return result;
    }

    public static double getFactorial (int inputA) {
        int i = 1;
        double result = 1;

        for (i = 1; i <= inputA; i++) {
            result = result * i;
        }
        return (double)result;
    }

    public static double getNegate(double inputA) {
        double result;
        result = (-1) * inputA ;
        return result;
    }

    // Memory Functions
    public static double addMemory(double memoryStored) {
        double storedVal = memoryStored;
        return storedVal;

    }
    public static double clearMemory() {
        return 0;
    }


    public static double recallMemory(double memoryStored) {
        double storedVal = memoryStored;
        return storedVal;
    }
//    Radians/Degrees functions
    public static double degToRad (double inputA) {
        double result = inputA * (Math.PI/180);
        return result;
    }

    public static double radToDeg (double inputA) {
        double result = inputA * (180/Math.PI);
        return result;
    }

    public static void preventString (double inputA ) {

        boolean validInputA = false;

        while (!validInputA) {
            try {
                inputA = Double.parseDouble(Console.getStringInput("Input first number:"));
                validInputA = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for the first number. Please enter a valid double value.");
            }
        }

    }


    //Print Memory Menu Buttons

    public static void printMemoryMenu(){
        System.out.format("A - M+\n" );
        System.out.format("B - MC\n" );
        System.out.format("C - MRC\n" );
    }

    public static void printArithmeticMenu() {
        System.out.format("|                     Arithmetic Menu                      |\n");
        System.out.format("|__________________________________________________________|\n");
        System.out.format("A - Addition\n" );
        System.out.format("B - Subtraction\n");
        System.out.format("C - Multiplication\n");
        System.out.format("D - Division\n");
        System.out.format("Q - Previous Menu\n");
        System.out.format("|__________________________________________________________|\n");
    }

    public static void  printExponentialMenu() {
        System.out.format("|                     Exponential Menu                     |\n");
        System.out.format("|__________________________________________________________|\n");
        System.out.format("A - Square Root\n");
        System.out.format("B - Square\n");
        System.out.format("C - Exponent\n");
        System.out.format("D - Inverse\n");
        System.out.format("Q - Previous Menu\n");
        System.out.format("|__________________________________________________________|\n");
    }


    public static void printTrigonometryMenu() {

        System.out.format("|                     Trigonometry Menu                    |\n");
        System.out.format("|__________________________________________________________|\n");
        System.out.format("A - Sine \n");
        System.out.format("B - Cosine\n");
        System.out.format("C - Tangent\n");
        System.out.format("D - Inverse Sine\n");
        System.out.format("E - Inverse Cosine\n");
        System.out.format("F - Inverse Tangent\n");
        System.out.format("G - Degrees to Radians \n");
        System.out.format("H - Radians to Degrees\n");
        System.out.format("Q - Previous Menu\n");
        System.out.format("|__________________________________________________________|\n");
    }

    public static void printLogarithmicMenu() {
        System.out.format("|                     Logarithmic Menu                     |\n");
        System.out.format("|__________________________________________________________|\n");
        System.out.format("A - Log\n");
        System.out.format("B - LN\n");
        System.out.format("C - Log10\n");
        System.out.format("D - e\n");
        System.out.format("Q - Previous Menu\n");
        System.out.format("|__________________________________________________________|\n");
    }

    public static void printSpecialFunctionsMenu() {
        System.out.format("|                  Special Functions Menu                  |\n");
        System.out.format("|__________________________________________________________|\n");
        System.out.format("A - Absolute Value\n");
        System.out.format("B - Pythagorean Theorem\n");
        System.out.format("C - Factorial\n");
        System.out.format("Q - Previous Menu\n");
        System.out.format("|__________________________________________________________|\n");
    }


}
