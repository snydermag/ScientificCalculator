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
        System.out.format("Main Menu\n");
        System.out.format("*Press key to select Menu Option*\n");
        System.out.format("%s | %s | %s","C - Clear", "I - +/-", "M - M+\n");
        System.out.format("________________________\n");
        System.out.format("A - Arithmetic\n");
        System.out.format("E - Exponential\n");
        System.out.format("T - Trigonometry\n");
        System.out.format("L - Logarithmic\n");
        System.out.format("S - Special\n");
        System.out.format("Q - Quit\n");
        System.out.format("________________________\n");

    }


}
