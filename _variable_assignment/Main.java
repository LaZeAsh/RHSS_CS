package _variable_assignment;
/*
Class Name: Main
Programmer: Ayush
Date Modified: Tuesday, September 27 2022
Description: Class for all the submissions of Module 2.3 Variables
*/
import hsa_ufa.Console;
public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        drawMapleLeaf(c);
    }
    /**
     * Calculates the stock left at the end of the year using various arithmetic operations
     * @param c
     */
    public static void wareHouseProblem(Console c) {
        //Initial Stock
        int initialStock = 26563;
        // # of Units purchased
        int unitsPurchased = 18625;
        // Total of the initial and purchased units
        int totalStock = initialStock + unitsPurchased;
        //Stocks left after damage
        double afterDamagesInitialStock = initialStock * 0.98;
        int unitsSold = 15045;
        totalStock = totalStock - (int) afterDamagesInitialStock;
        totalStock -= unitsSold;
        //Printing all the information in an orderly manner
        c.println("Initital Stock: " + initialStock + "\nStock left after damages: " + (int) afterDamagesInitialStock + "\nAddition Units Purchased " + unitsPurchased + "\nTotal Units Sold " + unitsSold + "\nYear end inventory " + totalStock);
    }
    /**
     * Adds 2 different variables and outputs the results in the HSA Console
     * @param c
     */
    public static void simpleAddition(Console c) {
        //Defining the numbers being used
        int number1 = 300;
        int number2 = 532;
        //Printing a statement of the numbers
        c.println(number1 + " + " + number2 + " = " + (number1 + number2));
    }
    /**
     * Draws a rectangle in the HSA console
     * @param c
     */
    public static void drawRectangles(Console c) {
        int consoleWidth = c.getWidth(); // Gets the width of the console
        int consoleHeight = c.getHeight(); // Gets the height of the console
        c.drawRect(0, 0, consoleWidth, consoleHeight);
    }
    /**
     * Draws the name Ayush Garg into the HSA console using the drawString method
     * @param c
     */
    public static void displayName(Console c) {
        String firstName = "Ayush";
        String lastName = "Garg";
        int xCoordinate = 10;
        int yCoordinate = 50;
        c.drawString(firstName + " " + lastName, xCoordinate, yCoordinate);
    }
    /**
     * Draws a maple leaf and is a bonus problem
     * @param c
     */
    public static void drawMapleLeaf(Console c) {
        c.drawMapleLeaf(0, 0, c.getWidth(), c.getHeight());
    }
}
