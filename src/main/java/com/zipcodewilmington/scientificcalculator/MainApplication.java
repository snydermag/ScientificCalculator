package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        boolean inMenu = true;
        double currVal = 0;
        double storedVal = 0;
        double inputA;
        double inputB;


//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as an integer", i);
//        Console.println("The user input %s as a d", d);

        while (inMenu) {
            printMainMenu();

            String menuSelection = Console.getStringInput("  Press Key to select Menu option");

            switch (menuSelection) {
                // User selects Clear - Will clear the current value and reset it to 0
                case "C":
                    break;

                // User selects Inverse - Will negate the current value
                case "I":
                    break;

                // User selects Memory - Will take User to Memory Menu
                case "M":
                    break;

                // User selects Arithmetic - Will take User to Arithmetic Menu
                case "A":
                    menuSelection = Console.getStringInput("Press Key to select Menu option");
                    switch (menuSelection) {

                        // User selects Addition - Will add two numbers to be inputted by User
                        case "A":
                            inputA = Console.getDoubleInput("Input first number:");
                            inputB = Console.getDoubleInput("Input second number:");
                            currVal = Function.getSum(inputA, inputB);
                            break;
                        // User selects Subtraction - Will subtract two numbers to be inputted by User
                        case "B":
                            inputA = Console.getDoubleInput("Input first number:");
                            inputB = Console.getDoubleInput("Input second number:");
                            currVal = Function.getSubtract(inputA, inputB);
                            break;
                        // User selects Multiply - Will multiply two numbers to be inputted by User
                        case "C":
                            inputA = Console.getDoubleInput("Input first number:");
                            inputB = Console.getDoubleInput("Input second number:");
                            currVal = Function.getMultiply(inputA, inputB);
                            break;
                        // User selects Divide - Will divide two numbers to be inputted by User
                        case "D":
                            inputA = Console.getDoubleInput("Input first number:");
                            inputB = Console.getDoubleInput("Input second number:");
                            currVal = Function.getDivide(inputA, inputB);
                            break;
                    }
                    break;

                // User selects Exponential - Will take User to Exponential Menu
                case "E":
                    menuSelection = Console.getStringInput("Press Key to select Menu option");
                    switch (menuSelection) {
                        // User selects Square Root - Will find the square root of number to be inputted by User
                        case "A":
                            inputA = Console.getDoubleInput("Input number:");
                            currVal = Function.getSquareRoot(inputA);
                            break;
                        // User selects Square - Will square number to be inputted by User
                        case "B":
                            inputA = Console.getDoubleInput("Input number:");
                            currVal = Function.getSquare(inputA);
                            break;
                        // User selects Exponent - Will find the value of number to the power of another number
                        // (both inputted by User)
                        case "C":
                            inputA = Console.getDoubleInput("Input first number:");
                            inputB = Console.getDoubleInput("Input second number:");
                            currVal = Function.getExponent(inputA, inputB);
                            break;
                        // User selects Inverse - Will find the value of 1 divided by number inputted by User
                        case "D":
                            inputA = Console.getDoubleInput("Input first number:");
                            currVal = Function.getInverse(inputA);
                            break;
                    }
                    break;

                // User selects Trigonometry - Will take User to Trigonometry Menu
                case "T":
                    menuSelection = Console.getStringInput("Press Key to select Menu option");
                    switch (menuSelection){
                        // User selects Sin - Will find Sine of number inputted by User
                        case "A":
                            inputA = Console.getDoubleInput("Input a number:");
                            currVal = Function.getSine(inputA);
                            break;
                        // User selects Cosine - Will find Cosine of number inputted by User
                        case "B":
                            inputA = Console.getDoubleInput("Input a number:");
                            currVal = Function.getCosine(inputA);
                            break;
                        // User selects Tangent - Will find Tangent of number inputted by User
                        case "C":
                            inputA = Console.getDoubleInput("Input a number:");
                            currVal = Function.getTangent(inputA);
                            break;
                        // User selects Inverse Sine - Will find Cosecant of number inputted by User
                        case "D":
                            inputA = Console.getDoubleInput("Input a number:");
                            currVal = Function.getInverseSine(inputA);
                            break;
                        // User selects Inverse Cosine - Will find Secant of number inputted by User
                        case "E":
                            inputA = Console.getDoubleInput("Input a number:");
                            currVal = Function.getInverseCosine(inputA);
                            break;
                        // User selects Inverse Tangent - Will find Cotangent of number inputted by User
                        case "F":
                            inputA = Console.getDoubleInput("Input a number:");
                            currVal = Function.getInverseTan(inputA);
                            break;
                    }
                    break;

                // User selects Logarithmic - Will take User to Logarithmic Menu
                case "L":
                    menuSelection = Console.getStringInput("Press Key to select Menu option");
                    switch (menuSelection) {
                        // User selects Log
                        case "A":
                            break;
                        // User selects Natural Log
                        case "B":
                            inputA = Console.getDoubleInput("Input a number:");
                            currVal = Function.getLN(inputA);
                            break;
                        // User selects Log base 10
                        case "C":
                            inputA = Console.getDoubleInput("Input a number:");
                            currVal = Function.getLog10(inputA);
                            break;
                        // User selects Inverse Log
                        case "D":
                            break;
                    }
                    break;

                // User selects Special - Will take User to Special Functions Menu
                case "S":
                    menuSelection = Console.getStringInput("Press Key to select Menu option");
                    switch (menuSelection) {
                        // User selects Absolute Value - Will return the Absolute Value of number inputted by User
                        case "A":
                            inputA = Console.getDoubleInput("Input number:");
                            currVal = Function.getAbsValue(inputA);
                            break;
                        // User selects Pythagorean Theorem
                        case "B":
                            inputA = Console.getDoubleInput("Input first number:");
                            inputB = Console.getDoubleInput("Input second number:");
                            currVal = Function.getPythagoreanTheorem(inputA, inputB);
                            break;
//                        User Selects Factorial
                        case "C":
                            inputA = Console.getDoubleInput("Input a number:");
                            currVal = Function.getFactorial((int)inputA);
                            break;
                    }
                    break;

                // User selects Quit - Will exit the program
                case "Q":
                    inMenu = false;
                    break;

                // User enters an invalid Menu option - Will prompt the User to enter another selection
                default:
                    System.out.println("Invalid input. Please try again.");
                    break;
            }


        }



    }
    public static void printMainMenu() {
        System.out.format("  **Calculator**\n|_________________|\n  Main Menu\n");
        System.out.format("|______________________________________________________________________________________________________________________|\n");
        System.out.format("%s %s %s","  [C] - Clear", "[I] - +/-", "[M] - M+\n");
        System.out.format("|______________________________________________________________________________________________________________________|\n");
        System.out.format("  [A] - Arithmetic  ");
        System.out.format("  [E] - Exponential  ");
        System.out.format("  [T] - Trigonometry  ");
        System.out.format("  [L] - Logarithmic  ");
        System.out.format("  [S] - Special  ");
        System.out.format("  [Q] - Quit\n");
        System.out.format("|______________________________________________________________________________________________________________________|\n");


    }


}
