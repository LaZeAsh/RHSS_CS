package _input_practice;
/*
Class Name: Main
Programmer: Ayush
Date Modified: Wednesday, September 28 2022
Description: Class for all the submissions of Module 2.4 Input Assignment
*/
import hsa_ufa.*;
public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        markBook(c);
    } // End of main method
    /**
     * @param c
     * Takes input of your student card and gives you an output
     */
    public static void studentCard(Console c) {
        // Taking required input
        c.println("Input your last name (String) ");
        String lastName = c.readLine();
        c.println("Input your first name (String) ");
        String firstName = c.readLine();
        c.println("Input your student number (int) ");
        int studentNumber = c.readInt();
        c.println("Input your home form (String) ");
        String homeForm = c.readLine();
        c.println("Input your grade (int) ");
        int grade = c.readInt();
        c.println("Input your school (String) ");
        String school = c.readLine();

        //Clearing the console
        c.clear();

        // Printing out the required input
        c.println("Name: " + firstName + " " + lastName);
        c.println("Student Number: " + studentNumber);
        c.println("Home Form: " + homeForm);
        c.println("Grade: " + grade);
        c.println("School: " + school);
    
    } // End of studentCard method
    /**
     * Calculator that allows you to make calculations
     * @param c
     */
    public static void calculator(Console c) {
        //Taking required input
        c.println("Input the type of operation you would like to do (String)");
        String operation = c.readLine();
        c.println("Input your 1st input (int) ");
        int input1 = c.readInt();
        c.println("Input your 2nd input (int) ");
        int input2 = c.readInt();

        // Clearing the console
        c.clear();

        c.println(input1 + " + " + input2 + " = " + (input1 + input2));
        c.println(input1 + " - " + input2 + " = " + (input1 - input2));
        c.println(input1 + " * " + input2 + " = " + (input1 * input2));
        c.println(input1 + " / " + input2 + " = " + (input1 / input2));

        if(operation.equals("addition")) {
            c.println("The output of your operation is " + (input1 + input2));
        } else if(operation.equals("subtraction")) {
            c.println("The output of your operation is " + (input1 - input2));
        } else if(operation.equals("multiplication")) {
            c.println("The output of your operation is " + (input1 * input2));
        } else if(operation.equals("division")) {
            c.println("The output of your operation is " + (input1 / input2));
        } else {
            c.println("Incorrect operation provided try again");
        }
    } // end of calculator method
    /**
     * Draws an appropriate rectangle according to user input
     * @param c
     */
    public static void rectangleFun(Console c) {
        //Taking required input
        c.println("Input height of rectangle (int) ");
        int height = c.readInt();
        c.println("Input width of rectangle (int) ");
        int width = c.readInt();
        c.println("x-coordinate of the rectangle (int) ");
        int xCoordinate = c.readInt();
        c.println("y-coordinate of the rectangle (int) ");
        int yCoordinate = c.readInt();

        //Clearing the console
        c.clear();

        //Drawing rectangle
        c.drawRect(xCoordinate, yCoordinate, width, height);
        c.println("Area of the rectangle: " + (width * height));
    } // End of rectangleFun method
    /**
     * Calculates the average of your marks inputted
     * @param c
     */
    public static void markBook(Console c) {
        //Taking required input
        c.println("Input your 1st mark");
        int firstMark = c.readInt();
        c.println("Input your 2nd mark");
        int secondMark = c.readInt();
        c.println("Input your 3rd mark");
        int thirdMark = c.readInt();
        c.println("Input your 4th mark");
        int fourthMark = c.readInt();

        //Clearing the console
        c.clear();

        //Give output as needed
        c.println("Your average mark is " + ((firstMark + secondMark + thirdMark + fourthMark) / 4));
        c.println("1st mark: " + firstMark + " 2nd mark: " + secondMark + " 3rd mark: " + thirdMark + " 4th mark: " + fourthMark + "\nAverage mark: " + ((firstMark + secondMark + thirdMark + fourthMark) / 4));
    }
    /**
     * Improved calculator that takes input and implements if statements
     * @param c
     */
    public static void goodCalculator(Console c) {
        //Taking required input
        c.println("Input the type of operation you would like to do (String)");
        String operation = c.readLine();
        c.println("Input your 1st input (int) ");
        int input1 = c.readInt();
        c.println("Input your 2nd input (int) ");
        int input2 = c.readInt();

        // Clearing the console
        c.clear();

        // if conditions for doing operations
        if(operation.equals("addition")) {
            c.println("The output of your operation is " + (input1 + input2));
        } else if(operation.equals("subtraction")) {
            c.println("The output of your operation is " + (input1 - input2));
        } else if(operation.equals("multiplication")) {
            c.println("The output of your operation is " + (input1 * input2));
        } else if(operation.equals("division")) {
            c.println("The output of your operation is " + (input1 / input2));
        } else {
            c.println("Incorrect operation provided try again");
        }
    } // End of goodCalculator method
} // End of Main Class
