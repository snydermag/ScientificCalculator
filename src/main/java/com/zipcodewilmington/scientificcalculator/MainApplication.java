package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        boolean inMenu = true;
        double currVal = 0;
        double storedVal = 0;

//        Console.println("Welcome to my calculator!");
//        String s = Console.getStringInput("Enter a string");
//        Integer i = Console.getIntegerInput("Enter an integer");
//        Double d = Console.getDoubleInput("Enter a double.");
//
//        Console.println("The user input %s as a string", s);
//        Console.println("The user input %s as a integer", i);
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

                // User selects M+ - Will store the value for later use
                case "M":
                    break;
                case "A":
                    break;
                case "E":
                    break;
                case "T":
                    break;
                case "L":
                    break;
                case "S":
                    break;
                case "Q":
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }





            inMenu = false;

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
