package _performanceassessment4;
import java.util.*;
import hsa_ufa.*;
/*
Programmer: Ayush
Date Modified: Wednesday, December 21, 2022
Class Name: Main
Description: Class for the solution of Programming Assignment
*/

public class Main 
{
    static Console c;           // The output console
    public static void main (String[] args)
    {
        int userInput;
        c = new Console ();
        int[] dimensions = {0, 0}; // [0] - length, [1] - width
        do
        {
            c.println("The dimensions of your rectangle are");
            c.println("Length: " + dimensions[0]);
            c.println("Width: " + dimensions[1]);
            c.println(" ");
            // Get the user menu selection
            userInput = menuSelection();
            String shape;
            // switch statement to process user input and execute cooresponding action
            switch(userInput) {
                case 1:
                    // INPUT
                    c.println("Please enter rectangle length (int)");
                    dimensions[0] = c.readInt(); // makes user input the length
                    c.println("Please enter rectangle width (int)");
                    dimensions[1] = c.readInt(); // makes user input the width
                    c.clear();
                    c.println("I have recorded your input.");
                    c.println("");
                    break;
                case 2:
                    // checks if square or not
                    if(isSquare(dimensions)) {
                        shape = "square";
                    } else {
                        shape = "rectangle";
                    }
                    c.clear();
                    // PROCESSING / OUTPUT
                    c.println("The perimeter of your " + shape + " is " + calcPerimeter(dimensions));
                    c.println(" ");
                    break;
                case 3:
                    // checks if square or not
                    if(isSquare(dimensions)) {
                        shape = "square";
                    } else {
                        shape = "rectangle";
                    }
                    c.clear();
                    // PROCESSING / OUTPUT
                    c.println("The area of your " + shape + " is " + calcArea(dimensions));
                    c.println(" ");
                    break;
                case 4:
                    // checks if square or not
                    // PROCESSING / OUTPUT
                    if(isSquare(dimensions)) {
                        c.clear();
                        c.println("Your rectangle is actually a square!");
                        c.println(" ");
                    } else {
                        c.clear();
                        c.println("Your rectangle is a rectangle!");
                        c.println(" ");
                    }
                    break;
            } // end of switch statement
        }
        while (userInput != 5);  // exit if user input equals 5
    } // main method
    
    /**
     * Asks user to select what action they want to perform
     * @return
     */
    public static int menuSelection ()
    {
        c.println ("Select Option (enter menu number)");
        c.println ("No.\t" + "Option");
        c.println ("1\t" + "Enter the dimensions of rectangle");
        c.println ("2\t" + "Perimeter of rectangle");
        c.println ("3\t" + "Area of rectangle");
        c.println ("4\t" + "Is the rectangle a square");
        c.println ("5\t" + "Quit");
        c.println(" ");
        return c.readInt ();
    } // menu selection method
    
    /**
    * calculates perimeter by adding length and width and multiplying it by 2
    * @param dims
    * @return
    */ 
    public static int calcPerimeter(int[] dims) {
        int perimeter = 0;
        int length = dims[0];
        int width = dims[1];
        perimeter = 2 * (length + width);
        return perimeter;
    } // end of calcPerimeter method

    /**
     * Calculates area by multiplying length and width
     * @param dims
     * @return
     */
    public static int calcArea(int[] dims) {
        int area = 0;
        int length = dims[0];
        int width = dims[1];
        area = length * width;
        return area; 
    } // end of calcArea method

    /**
     * Tells if the shape is a square by checking if length and width are the same
     * @param dims
     * @return
     */
    public static boolean isSquare(int[] dims) {
        boolean answer = false;
        int length = dims[0];
        int width = dims[1];
        if(length == width) {
            answer = true;
        }
        return answer; 
    } // end of isSquare method
} // end of Main class
