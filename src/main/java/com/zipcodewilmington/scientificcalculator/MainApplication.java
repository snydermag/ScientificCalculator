package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        boolean inMenu = true;

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

            inMenu = false;

        }



    }
    public static void printMainMenu() {
        System.out.format("Main Menu");
        System.out.format("*Press key to select Menu Option*");
        System.out.format("%s %s %s","C - Clear", "I - +/-", "M - M+");
        System.out.format("______");
        System.out.format("A - Arithmetic");
        System.out.format("E - Exponential");
        System.out.format("T - Trigonometry");
        System.out.format("L - Logarithmic");
        System.out.format("S - Special");
        System.out.format("Q - Quit");

    }


}
