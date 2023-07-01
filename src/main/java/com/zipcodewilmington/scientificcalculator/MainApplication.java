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
        double inputC;


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

            String menuSelection = Console.getStringInput("Press Key to select Menu option");

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

                        // User Selects Addition - Will add two numbers to be inputted by User
                        case "A":
                            inputA = Console.getDoubleInput("Input first number:");
                            inputB = Console.getDoubleInput("Input second number:");
                            currVal = Function.getSum(inputA, inputB);
                            break;
                        // User Selects Subtraction - Will subtract two numbers to be inputted by User
                        case "B":
                            break;
                        // User Selects Multiply - Will multiply two numbers to be inputted by User
                        case "C":
                            break;
                        // User Selects Divide - Will divide two numbers to be inputted by User
                        case "D":
                            break;
                    }
                    break;

                // User selects Exponential - Will take User to Exponential Menu
                case "E":
                    menuSelection = Console.getStringInput("Press Key to select Menu option");
                    switch (menuSelection) {
                        case "A":
                            break;
                        case "B":
                            break;
                        case "C":
                            break;
                        case "D":
                            break;
                    }
                    break;

                // User selects Trigonometry - Will take User to Trigonometry Menu
                case "T":
                    menuSelection = Console.getStringInput("Press Key to select Menu option");
                    switch (menuSelection){
                        case "A":
                            break;
                        case "B":
                            break;
                        case "C":
                            break;
                        case "D":
                            break;
                        case "E":
                            break;
                        case "F":
                            break;
                    }
                    break;

                // User selects Logarithmic - Will take User to Logarithmic Menu
                case "L":
                    menuSelection = Console.getStringInput("Press Key to select Menu option");
                    switch (menuSelection) {
                        case "A":
                            break;
                        case "B":
                            break;
                        case "C":
                            break;
                        case "D":
                            break;
                    }

                    break;

                // User selects Special - Will take User to Special Functions Menu
                case "S":
                    menuSelection = Console.getStringInput("Press Key to select Menu option");
                    switch (menuSelection) {
                        case "A":
                            break;
                        case "B":
                            break;
                        case "C":
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
        System.out.format("Main Menu\n");
        System.out.format("%s %s %s","C - Clear", "I - +/-", "M - M+\n");
        System.out.format("______");
        System.out.format("A - Arithmetic");
        System.out.format("E - Exponential");
        System.out.format("T - Trigonometry");
        System.out.format("L - Logarithmic");
        System.out.format("S - Special");
        System.out.format("Q - Quit");

    }


}
