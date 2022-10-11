package _ipo_review;
/*
Programmer: Ayush
Date Modified: Monday, October 11 2022
Description: Class for all the submissions of the 2.6 review module
*/
import hsa_ufa.*;
public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        markCalculator(c);
    } // end of main method
    /**
     * Generates 4 marks for 4 classes that the user inputs then outputs the average of all 4 of them
     * @param c
     */
    public static void markCalculator(Console c) {
        // Input of markCalculator
        c.println("Enter the name of your 1st course");
        String course1Name = c.readLine();
        c.println("Enter the name of your 2nd course");
        String course2Name = c.readLine();
        c.println("Enter the name of your 3rd course");
        String course3Name = c.readLine();
        c.println("Enter the name of your 4th course");
        String course4Name = c.readLine();

        c.clear(); // Clearing the HSA Console (to make it neater)
        
        // Processing of markCalculator
        // Generating random numbers between 40 - 100 and rounding to 1 decimal place
        double course1Mark = Math.round(((Math.random() * (100 - 40)) + 40) * 10.0) / 10.0;
        double course2Mark = Math.round(((Math.random() * (100 - 40)) + 40) * 10.0) / 10.0;
        double course3Mark = Math.round(((Math.random() * (100 - 40)) + 40) * 10.0) / 10.0;
        double course4Mark = Math.round(((Math.random() * (100 - 40)) + 40) * 10.0) / 10.0;

        // finds the average mark of all 4 courses and rounds to 1 decimal place
        double averageMark = Math.round(((course1Mark + course2Mark + course3Mark + course4Mark) / 4) * 10.0) / 10.0;
        
        
        // Output of markCalculator
        c.print("Course: ");
        c.print(course1Name,10);
        c.print("\t"); 
        c.print(course1Mark,4,1);
        c.print(" %\n"); 
        
        // Course 2 Marks
        c.print("Course: ");
        c.print(course2Name,10);
        c.print("\t"); 
        c.print(course2Mark,4,1);
        c.print(" %\n"); 
        
        //Course 3 marks
        c.print("Course: ");
        c.print(course3Name,10);
        c.print("\t"); 
        c.print(course3Mark,4,1);
        c.print(" %\n"); 
        
        // Course 4 marks
        c.print("Course: ");
        c.print(course4Name,10);
        c.print("\t"); 
        c.print(course4Mark,4,1);
        c.print(" %\n"); 
        
        c.println("\nAverage Mark: " + averageMark + "%");
        
    } // end of mark calculator method

    public static void changeCalculator() {
        //Input of changeCalculator

        c.println("Input the cost of your bill");
        double billAmount = c.readDouble();
        c.println("Input the amount of money you are paying with");
        double billPayment = c.readDouble();
        

        // Processing of changeCalculator

        double change = billPayment - billAmount;

        if(change < 0) {
            c.println("You do not have enough money to pay the bill! Try again");
            return;
        }

        if(change % 1 == 0) {
            if(change % 20 == 0) {
                c.println("Your change is " + (change / 20) + " $20 bills");
                return;
            } else if(change % 10 == 0) {
                c.println("Your change is " + (change / 10) + " $10 bills");
                return;
            } else if(change % 5 == 0) {
                c.println("Your change is " + (change / 5) + " $5 bills");
                return;
            } else {
                c.println("Your change is " + (change / 1) + " $1 bills");
            }            
        }

        if(change % 0.25 == 0) {
            if(change % 20 == 0) {
                c.println("Your change is " + ((int) change / 20) + " $20 bills");
                change = (int) change / 20;
                c.println("Along with " + (change / 0.25) + " quarters");
                return;
            } else if(change % 10 == 0) {
                c.println("Your change is " + ((int)change / 10) + " $10 bills");
                change = (int) change / 10;
                c.println("Along with " + (change / 0.25) + " quarters");
                return;
            } else if(change % 5 == 0) {
                c.println("Your change is " + (change / 5) + " $5 bills");
                change = (int) change / 5;
                c.println("Along with " + (change / 0.25) + " quarters");
                return;
            } else if(change % 1 == 0) {
                c.println("Your change is " + (change / 1) + " $1 bills");
                change = (int) change / 1;
                c.println("Along with " + (change / 0.25) + " quarters");
            } else {
                c.println("Your change is " + (change / 0.25) + " quarters");
            }     
        }
        // logic doesn't make sense if 
        if(change % 0.1 == 0) {
            // Think about these if statements dont make sense
            if(!(change % 20.0 < 0)) {
                c.println("Your change is " + ((int) change / 20) + " $20 bills");
                change = (int) change / 20;
                c.println("Along with " + ((int)change / 0.25) + " quarters");
                change = (int) change / 0.1;
                c.println("Along with " + (change / 0.1) + " dimes");
                return;
            } else if(!(change % 10.0 < 0)) {
                c.println("Your change is " + ((int)change / 10) + " $10 bills");
                change = (int) change / 10;
                c.println("Along with " + ((int)change / 0.25) + " quarters");
                change = (int) change / 0.1;
                c.println("Along with " + (change / 0.1) + " dimes");
                return;
            } else if(!(change % 5.0 < 0)) {
                c.println("Your change is " + (change / 5) + " $5 bills");
                change = (int) change / 5;
                c.println("Along with " + ((int)change / 0.25) + " quarters");
                change = (int) change / 0.1;
                c.println("Along with " + (change / 0.1) + " dimes");
                return;
            } else if(!(change % 1.0 < 0)) {
                c.println("Your change is " + (change / 1) + " $1 bills");
                change = (int) change / 1;
                c.println("Along with " + ((int)change / 0.25) + " quarters");
                change = (int) change / 0.1;
                c.println("Along with " + (change / 0.1) + " dimes");
            } else if(!(change % 0.25 < 0)) {
                // c.println("Your change is " + ());
            }
        }
        
    } // end of changeCalculator method

} // end of class
