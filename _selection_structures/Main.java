package _selection_structures;
import hsa_ufa.*;
/*
Programmer: Ayush
Date Modified: Monday, October 17 2022
Class Name: Main
Description: Class for the solution of the 3.1 programming assignment
*/
public class Main {
    static Console c = new hsa_ufa.Console();
    public static void main(String[] args) {
        c = new Console();
        largestValue(c);
        smallestValue(c);
        discountCalculator(c);
        simpleCalculator(c);
        rectangleAnalysis(c);
        magic8ball(c);    
    }
    /**
     * Gets the largest value when provided 2 doubles
     * @param c
     */
    public static void largestValue(Console c) {
        // Getting input to compare numbers

        c.println("Input a number (double)");
        double num1 = c.readDouble();
        c.println("Input a number (double)");
        double num2 = c.readDouble();

        // Processing / Output
        // If statements compare 2 numbers and return a message

        if(num1 > num2) {
            c.println("The greater number is " + num1);
        } else if(num2 > num1) {
            c.println("The greater number is " + num2);
        } else {
            c.println("Both the numbers equal " + num1);
        }
    } // end of method
    /**
     * Gets the smallest value when provided 2 doubles
     * @param c
     */
    public static void smallestValue(Console c) {
        // Getting input to compare numbers

        c.println("Input a number (double)");
        double num1 = c.readDouble();
        c.println("Input a number (double)");
        double num2 = c.readDouble();

        // Processing / Output
        // If statements compare 2 numbers and return a message

        if(num1 < num2) {
            c.println("The smaller number is " + num1);
        } else if(num2 < num1) {
            c.println("The smaller number is " + num2);
        } else {
            c.println("Both the numbers equal " + num1);
        }
    } // end of method
    /**
     * Converts the grade to a letter
     * @param c
     */
    public static void gradeConverter(Console c) {
       c.println("Input your grade (double)"); 
       // Truncated the grade for case statement
        int grade = (int) c.readDouble() / 10;
        switch(grade) {
            case 9:
                c.println("You got the grade: A+");
                break;
            case 8:
                c.println("You got the grade: A");
                break;
            case 7:
                c.println("You got the grade: B");
                break;
            case 6:
                c.println("You got the grade: C");
                break;
            case 5:
                c.println("You got the grade: D");
                break;
            case 4:
                c.println("You got the grade: F");
                break;
            case 3:
                c.println("You got the grade: F");
                break;
            case 2:
                c.println("You got the grade: F");
                break;
            case 1:
                c.println("You got the grade: F");
                break;
            case 0:
                c.println("You got the grade: F");
                break;
        }
    }
    /**
     * Provides the amount of money you spent
     * @param c
     */
    public static void discountCalculator(Console c) {
        // Gettting input to calculate output

        c.println("How much did you spend today? (double)");
        double amount = c.readDouble();
        
        // Processing / Output

        if(amount > 100) {
            amount *= 0.85;
            amount *= 1.13;
            c.println("The amount you pay is " + amount + " after taxes and a 15% discount");
        } else {
            amount *= 1.13;
            c.println("The amount you pay is " + amount + " after taxes");
        }
    } // end of method
    /**
     * Calculates depending on the operation
     * @param c
     */
    public static void simpleCalculator(Console c) {
        // INPUT
        // Takes input in from the user and assignes it to vars
        c.println("Please input your 1st number (double)");
        double num1 = c.readDouble();
        c.println("Please input your 2nd number (double)");
        double num2 = c.readDouble();
        c.println("Please input the operation you would like to do (+, -, /, *)");
        String operation = c.readLine();

        // Processing and output
        // Switch statement makes cases for which operation and returns you the appropriate value
        switch(operation) {
            case "+":
                c.println("Your output is " + (num1 + num2));
                break;
            case "-":
                c.println("Your output is " + (num1 - num2));
                break;
            case "*":
                c.println("Your output is " + (num1 * num2));
                break;
            case "/":
                c.println("Your output is " + (num1 / num2));
                break;
        } // end of switch statement
    } // end of method
    /**
     * Analyzes the rectangle based on user input
     * @param c
     */
    public static void rectangleAnalysis(Console c) {
        // INPUT
        // takes input for rectangle measurements
        c.println("Input your rectangle width (double)");
        double width = c.readDouble();
        c.println("Input your rectangle length (double)");
        double length = c.readDouble();
        c.println("Please selection an option");
        c.println("1 Dimensions of rectangle");
        c.println("2 Perimeter of rectangle");
        c.println("3 Area of rectangle");
        c.println("4 Check if rectangle is square");
        int option = c.readInt();

        // Processing and Output
        // Statement to determine what the user wants

        switch(option) {    
            case 1:
                c.println("The length of your rectangle is " + length + " and the width is " + width);
                break;
            case 2:
                c.println("The perimeter of your rectangle is " + (2 * (length + width)));
                break;
            case 3:
                c.println("The area of your rectangle is " + (length * width));
                break;
            case 4: 
                if(length == width) {
                    c.println("Your rectangle is a square");
                } else {
                    c.println("The rectangle is not a square");
                }
                break;
        } // end of switch statement
    } // end of method
    /**
     * Bonus question magic8ball
     * @param c
     */
    public static void magic8ball(Console c) {
        c.println("How do you feel today?");
        String mood = c.readLine();
        double randDouble = Math.round(Math.random() * 100) / 100.0;

       if(mood.toLowerCase().equals("happy")) {
        if(randDouble > 0 && randDouble < 0.33) {
            c.println("The answer is yes");
            c.println("Have a nice day!");
        } else if(randDouble > 0.34 && randDouble < 0.66) {
            c.println("The answer is no");
            c.println("Have a nice day!");
        } else if(randDouble > 0.67 && randDouble < 1) {
            c.println("The answer is maybe");
            c.println("Have a nice day!");
        }
       } else if(mood.toLowerCase().equals("angry")) {
        if(randDouble > 0 && randDouble < 0.33) {
            c.println("The answer is no");
            c.println("You bother me too much");
        } else if(randDouble > 0.34 && randDouble < 0.66) {
            c.println("The answer is no");
            c.println("You bother me too much");
        } else if(randDouble > 0.67 && randDouble < 1) {
            c.println("The answer is maybe");
            c.println("You bother me too much");
        }
       } else if(mood.toLowerCase().equals("sad")) {
        if(randDouble > 0 && randDouble < 0.33) {
            c.println("The answer is no");
            c.println("Have an okay day!");
        } else if(randDouble > 0.34 && randDouble < 0.66) {
            c.println("The answer is no");
            c.println("Have an okay day!");
        } else if(randDouble > 0.67 && randDouble < 1) {
            c.println("The answer is maybe");
            c.println("Have an okay day!");
        }    
       } else {
        c.println("Invalid input");
       }
    }
} // end of class
