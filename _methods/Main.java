/*
Class Name: Main
Programmer: Ayush
Date Modified: Monday, December 12 
Description: Class for the submission of 4.1 action problems
*/
package _methods;
import hsa_ufa.*;

public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        int[] arr = {1, 2, 3};
        // executing all the methods
        cube(c, 5);
        tax(c, 12.3);
        printName(c, "Ayush", 10);
        sumOfInt(c, 5);
        arraySum(c, arr);
        diceRoll(c);
    } // end of main method
    /**
     * Cubes a number
     * @param c
     * @param x
     */
    public static void cube(Console c, int x) {
        // raising the numbers power by 3
        c.println((Math.pow(x, 3)));
    } // end of cube method
    /**
     * Calculates tax
     * @param c
     * @param x
     */
    public static void tax(Console c, double x) {
        double HST = x * 0.13;
        c.println("HST: " + HST);
        // calculates final price
        c.println("Final Price: " + (x + HST));
    } // end of tax method
    /**
     * Prints user's name
     * @param c
     * @param name
     * @param x
     */
    public static void printName(Console c, String name, int x) {
        for (int y = 0; y < x; y++) {
            // prints name x # of time
            c.println(name);
        }
    } // end of printName metho
    /**
     * Finds sum of the numbers of an integer
     * @param c
     * @param x
     */
    public static void sumOfInt(Console c, int x) {
        int sum = 0;
        String numParseString = Integer.toString(x);
        for (int y = 0; y < numParseString.length(); y++) {
            sum += Integer.parseInt(numParseString);
        }
        // prints the sum of the number
        c.println("The sum of that number was " + sum);
    } // end of sumOfInt method

    /*
    Pseudocode - 
    Initialize a variable to the value of 0
    Iterate through the array and add the value to the variable
    Print the variable
     */
    /**
     * Finds the sum of numbers in an array
     * @param c
     * @param array
     */
    public static void arraySum(Console c, int[] array) {
        int sum = 0;
        for (int x = 0; x < array.length; x++) {
            sum += array[x];
        }
        c.println("Sum of the values in the array is " + sum);
    } // end of arraySum method
    /*
    Pseudocode -
    Define 2 variables with type int
    1 variable with type string
    make an infinite for loop that iterates until prompted to break by user
    In the for loop generate 2 numbers between 1 - 6
    Output the roll number values of 2 numbers and the total of 2 numbers
    Prompt the user to see if they would like to continue
     */
    /**
     * Potrays a dice roll
     * @param c
     */
    public static void diceRoll(Console c) {
        int dice1 = 0;
        int dice2 = 0;
        String userInput = "";
        // c.println();
        for(int x = 0; true; x++) {
            if(!userInput.equals(null) && !userInput.equals("")) {
                break;
            }
            // calcualtes a number between 1 - 6 (inclusive)
            dice1 = (int) Math.round(Math.random() * (6 - 1)) + 1;
            dice2 = (int) Math.round(Math.random() * (6 - 1)) + 1;
            c.println("Roll " + (x + 1) + " - a " + dice1 + " and " + dice2 + " - a total of " + (dice1 + dice2));
            c.println("Press enter to continue or enter an input to quit");
            userInput = c.readLine();
        }
    } // end of diceRoll method
} // end of Main Class