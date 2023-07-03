package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        boolean inMenu = true;
        double currVal = 0;
        boolean isRadians = false;
        double storedVal = 0;
        double inputA ;
        double inputB;


        while (inMenu) {
            printTopMenu(currVal, isRadians);
            printMainMenu();

            String menuSelection = Console.getStringInput("\uD835\uDE17\uD835\uDE33\uD835\uDE26\uD835\uDE34\uD835\uDE34 \uD835\uDE12\uD835\uDE26\uD835\uDE3A \uD835\uDE35\uD835\uDE30 \uD835\uDE34\uD835\uDE26\uD835\uDE2D\uD835\uDE26\uD835\uDE24\uD835\uDE35 \uD835\uDE14\uD835\uDE26\uD835\uDE2F\uD835\uDE36 \uD835\uDE30\uD835\uDE31\uD835\uDE35\uD835\uDE2A\uD835\uDE30\uD835\uDE2F:");

            switch (menuSelection) {

                // User selects Clear - Will clear the current value and reset it to 0
                case "C":
                    currVal = 0;
                    break;

                // User selects Inverse - Will negate the current value
                case "I":
                    currVal = Function.getNegate(currVal);
                    break;

                // User selects Memory - Will take User to Memory Menu
                case "M":
                    // Print Calculator Menu
                    printTopMenu(currVal,isRadians);
                    Function.printMemoryMenu();
                    menuSelection = Console.getStringInput("Press Key to select Menu option:");
                    switch (menuSelection){

                        // User selects M+ - Will store the current value displayed to memory
                        case "A":
                            storedVal = currVal;
                            break;
                        // User selects MC - Will set the stored value to Zero
                        case "B":
                            storedVal = 0;
                            break;
                        // User selects MRC - Will set the current value to be the stored value
                        case "C":
                            currVal = storedVal;
                            break;
                        // User selects Quit - Will return User to Main Menu
                        case "Q":
                            break;
                        // User enters an invalid Menu option - Will return User to the Main Menu
                        default:
                            System.out.println("Invalid input. Returning to Main Menu.");
                            break;
                    }
                    break;

                // User selects Arithmetic - Will take User to Arithmetic Menu
                case "A":
                    // Print Calculator Menu
                    printTopMenu(currVal, isRadians);
                    Function.printArithmeticMenu();
                    menuSelection = Console.getStringInput("Press Key to select Menu option:");
                    switch (menuSelection) {

                        // User selects Addition - Will add two numbers to be inputted by User
                        case "A":
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            try {
                                inputB = Console.getDoubleInput("Input second number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getSum(inputA, inputB);
                           break;
                        // User selects Subtraction - Will subtract two numbers to be inputted by User
                        case "B":
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            try {
                                inputB = Console.getDoubleInput("Input second number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getSubtract(inputA, inputB);
                            break;
                        // User selects Multiply - Will multiply two numbers to be inputted by User
                        case "C":
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            try {
                                inputB = Console.getDoubleInput("Input second number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getMultiply(inputA, inputB);
                            break;
                        // User selects Divide - Will divide two numbers to be inputted by User
                        case "D":
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            try {
                                inputB = Console.getDoubleInput("Input second number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }

                            if (inputA == 0) {
                                System.out.println("You cannot divide by Zero. Returning to Main Menu.");
                                break;
                            }

                            currVal = Function.getDivide(inputA, inputB);
                            break;
                        // User selects Quit - Will return User to Main Menu
                        case "Q":
                            break;
                        // User enters an invalid Menu option - Will return User to the Main Menu
                        default:
                            System.out.println("Invalid input. Returning to Main Menu.");
                            break;
                    }
                    break;

                // User selects Exponential - Will take User to Exponential Menu
                case "E":
                    // Print Calculator Menu
                    printTopMenu(currVal, isRadians);
                    Function.printExponentialMenu();
                    menuSelection = Console.getStringInput("Press Key to select Menu option:");
                    switch (menuSelection) {

                        // User selects Square Root - Will find the square root of number to be inputted by User
                        case "A":
                            try {
                                inputA = Console.getDoubleInput("Input number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }

                            if (inputA < 0) {
                                System.out.println("You cannot get the square root of a negative number. Returning to Main Menu.");
                                break;
                            }
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
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            try {
                                inputB = Console.getDoubleInput("Input second number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getExponent(inputA, inputB);
                            break;
                        // User selects Inverse - Will find the value of 1 divided by number inputted by User
                        case "D":
                            try {
                                inputA = Console.getDoubleInput("Input number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getInverse(inputA);
                            break;
                        // User selects Quit - Will return User to Main Menu
                        case "Q":
                            break;
                        // User enters an invalid Menu option - Will return User to the Main Menu
                        default:
                            System.out.println("Invalid input. Returning to Main Menu.");
                            break;

                    }
                    break;

                // User selects Trigonometry - Will take User to Trigonometry Menu
                case "T":
                    // Print Calculator Menu
                    printTopMenu(currVal, isRadians);
                    Function.printTrigonometryMenu();
                    menuSelection = Console.getStringInput("Press Key to select Menu option:");
                    switch (menuSelection){

                        // User selects Sine - Will find Sine of number inputted by User
                        case "A":
                            try {
                                inputA = Console.getDoubleInput("Input number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getSine(inputA);
                            break;
                        // User selects Cosine - Will find Cosine of number inputted by User
                        case "B":
                            try {
                                inputA = Console.getDoubleInput("Input number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getCosine(inputA);
                            break;
                        // User selects Tangent - Will find Tangent of number inputted by User
                        case "C":
                            try {
                                inputA = Console.getDoubleInput("Input number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getTangent(inputA);
                            break;
                        // User selects Inverse Sine - Will find Cosecant of number inputted by User
                        case "D":
                            try {
                                inputA = Console.getDoubleInput("Input number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getInverseSine(inputA);
                            break;
                        // User selects Inverse Cosine - Will find Secant of number inputted by User
                        case "E":
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getInverseCosine(inputA);
                            break;
                        // User selects Inverse Tangent - Will find Cotangent of number inputted by User
                        case "F":
                            try {
                                inputA = Console.getDoubleInput("Input number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getInverseTan(inputA);
                            break;
                        // User selects Degree to Radians - Will convert the number provided by User
                        case "R" :
                            if (isRadians) {
                                currVal = Function.radToDeg(currVal);
                                isRadians = false;
                            }
                            else {
                                currVal = Function.degToRad(currVal);
                                isRadians = true;
                            }
                            break;

                        // User selects Quit - Will return User to Main Menu
                        case "Q":
                            break;
                        // User enters an invalid Menu option - Will return User to the Main Menu
                        default:
                            System.out.println("Invalid input. Returning to Main Menu.");
                            break;

                    }
                    break;

                // User selects Logarithmic - Will take User to Logarithmic Menu
                case "L":
                    // Print Calculator Menu
                    printTopMenu(currVal, isRadians);
                    Function.printLogarithmicMenu();
                    menuSelection = Console.getStringInput("Press Key to select Menu option:");
                    switch (menuSelection) {

                        // User selects Log
                        case "A":
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            try {
                                inputB = Console.getDoubleInput("Input second number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getLog(inputA, inputB);
                            break;
                        // User selects Natural Log
                        case "B":
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getLN(inputA);
                            break;
                        // User selects Log base 10
                        case "C":
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getLog10(inputA);
                            break;
                        // User selects Inverse Log
                        case "D":
                            break;
                        // User selects Quit - Will return User to Main Menu
                        case "Q":
                            break;
                        // User enters an invalid Menu option - Will return User to the Main Menu
                        default:
                            System.out.println("Invalid input. Returning to Main Menu.");
                            break;

                    }
                    break;

                // User selects Special - Will take User to Special Functions Menu
                case "S":
                    // Print Calculator Menu
                    printTopMenu(currVal, isRadians);
                    Function.printSpecialFunctionsMenu();
                    menuSelection = Console.getStringInput("Press Key to select Menu option:");
                    switch (menuSelection) {

                        // User selects Absolute Value - Will return the Absolute Value of number inputted by User
                        case "A":
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getAbsValue(inputA);
                            break;
                        // User selects Pythagorean Theorem
                        case "B":
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            if (inputA <= 0) {
                                System.out.println("You cannot have a Triangle side with less than One. Returning to Main Menu.");
                                break;
                            }

                            try {
                                inputB = Console.getDoubleInput("Input second number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }

                            if (inputB <= 0) {
                                System.out.println("You cannot have a Triangle side with less than One. Returning to Main Menu.");
                                break;
                            }

                            currVal = Function.getPythagoreanTheorem(inputA, inputB);
                            break;
//                        User Selects Factorial
                        case "C":
                            try {
                                inputA = Console.getDoubleInput("Input first number:");
                            } catch (Exception e) {
                                System.out.println("Invalid Input. Returning to Main Menu.");
                                break;
                            }
                            currVal = Function.getFactorial((int)inputA);
                            break;
                        // User selects Quit - Will return User to Main Menu
                        case "Q":
                            break;
                        // User enters an invalid Menu option - Will return User to the Main Menu
                        default:
                            System.out.println("Invalid input. Returning to Main Menu.");
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


    public static void printTopMenu(Double currVal, boolean isRadians) {

        System.out.format("✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖✧\n");

        System.out.format("|                         \uD835\uDDD6\uD835\uDDEE\uD835\uDDF9\uD835\uDDF0\uD835\uDE02\uD835\uDDF9\uD835\uDDEE\uD835\uDE01\uD835\uDDFC\uD835\uDDFF                          |\n");
        if (isRadians) {
            System.out.format("%s %52f %s\n","| Rad", currVal,"|");
        }
        else {
            System.out.format("%s %56f %s\n", "|", currVal, "|");
        }
        System.out.format("|✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧|\n");
    }

    public static void printMainMenu() {
        System.out.format("|  %s    |    %s   |    %s  |\n","[C] - Clear", "[I] - +/-", "[M] - Memory Menu");
        System.out.format("|✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧|\n");
        System.out.format("|                          \uD835\uDDE0\uD835\uDDF2\uD835\uDDFB\uD835\uDE02                            |\n");
        System.out.format("|✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧|\n");
        System.out.format("%s %s %42s", "|","[A] - Arithmetic","|\n");
        System.out.format("%s %s %41s", "|", "[E] - Exponential", "|\n");
        System.out.format("%s %s %40s", "|", "[T] - Trigonometry", "|\n");
        System.out.format("%s %s %41s", "|","[L] - Logarithmic", "|\n");
        System.out.format("%s %s %45s", "|", "[S] - Special", "|\n");
        System.out.format("%s %s %48s", "|", "[Q] - Quit", "|\n");
        System.out.format("|✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧˖°✧|\n");

    }
}
