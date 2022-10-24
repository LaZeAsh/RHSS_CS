package _repetition_structures;
import hsa_ufa.*;

/*
Programmer: Ayush
Date Modified: Monday, October 24 2022
Class Name: Main 
Description: Class for the solution of activity 3.2 
*/
class Main {
    static Console c;

    public static void main(String[] args) {
        c = new Console();
        L2Q1_Echo(c);
        L2Q2_TempConverter2(c);
        L2Q3_SellThisHouse(c);
        L2Q4_ImTallerThanYou(c);
        L2Q5_Marks2(c);
        L2Q6_PrimeNumbers(c);
        L2Q7_TimeTables(c);
        L2Q8_BonusQuestion(c);
    }

    /**
     * For loop to input numbers and print numbers that satisfy the condition
     * 
     * @param c
     */
    public static void L2Q1_Echo(Console c) {
        int num1 = 0;
        int column = 0;
        // Input / Processing
        // For loop to see if the number satisfied the condition or not
        for (int i = 0; i <= 4; i++) {
            c.setCursor(1, 1);
            c.println("Input 5 numbers between 1 - 10 (int)");
            num1 = c.readInt();
            if (num1 < 1 || num1 > 10) {
                c.println("Your number did not satisfy the condition");
                break;
            }
            // Output
            c.setCursor(25, column);
            column++;
            c.println(num1);
        }
    } // end of L21_Echo method

    /**
     * Converts the temp from celsius to farenheit
     * 
     * @param c
     */
    public static void L2Q2_TempConverter2(Console c) {
        int celsiusTemp = 0;
        // Calculation
        // For loop to find the farenheit equivalent of the temperature in 10º
        // increments
        for (int x = 0; x < 11; x++) {
            double farenheitTemp = ((9 / 5) * celsiusTemp) + 32;
            c.println(celsiusTemp + " in farenheit is " + farenheitTemp);
            celsiusTemp += 10;
        }
    } // end of L2Q2_TempConverter2 method

    /**
     * Finds the price of the house after a certain number of weeks
     * 
     * @param c
     */
    public static void L2Q3_SellThisHouse(Console c) {
        // Defining / Input
        int initialPrice = 427000;
        int sellPrice = 376000;
        // For loop to calculate the weeks after the price is 376000
        for (int x = 0;; x++) {
            if (initialPrice == sellPrice) {
                c.println(x + " the number of weeks for the house to sell");
                break;
            }
            initialPrice = (int) Math.round(initialPrice * 0.95);
        }
    } // end of L2Q3_SellThisHouse method

    /**
     * Finds the tallest height out of the heights inputted
     * 
     * @param c
     */
    public static void L2Q4_ImTallerThanYou(Console c) {
        double height = 0;
        double shortestHeight = 0;
        double tallestHeight = 0;
        double averageHeight = 0;
        // For loop for getting input of the height until negative number
        // Input and Processing
        for (int x = 0;; x++) {
            c.println("Enter a height in meters");
            height = c.readDouble();
            if (height < 0) {
                averageHeight /= x;
                break;
            }
            if (height > tallestHeight) {
                tallestHeight = height;
            }
            if (height < shortestHeight) {
                shortestHeight = height;
            }
            averageHeight += height;
        }
        // Output
        c.println("The shortest height was " + shortestHeight);
        c.println("The tallest height was " + tallestHeight);
        c.println("The shortest height was " + averageHeight);
    } // end of L2Q4_ImTallerThanYou method

    /**
     * Generates marks for the # of students inputted and calculates their average
     * 
     * @param c
     */
    public static void L2Q5_Marks2(Console c) {
        // INPUT
        c.println("Input the number of students in the class");
        int students = c.readInt();
        double average = 0;

        // PROCESSING
        // for loop to calculate students grades
        for (int x = 0; x < students; x++) {
            average = Math.random() * 100;
            if (x == students - 1) {
                average /= x;
            }
        }

        // OUTPUT
        c.println("The average mark in the class were " + average);
    } // end of L2Q5_Marks2 method

    /**
     * Gets all the prime numbers between 2 - 100 using 2 for loops
     * 
     * @param c
     */
    public static void L2Q6_PrimeNumbers(Console c) {
        // Processing and output
        // For loop to check which number is a prime number
        for (int x = 2; x < 101; x++) {
            // for loop to iterate through the divisors
            for (int i = 2; i < 101; i++) {
                if (x % i == 0 && x != i || x == 2) {
                    System.out.println(x + " is not a prime number");
                    break;
                }
                if (i >= x) {
                    c.println(x + " is a prime number");
                    break;
                }
            }
        }
    } // end of L2Q6_PrimeNumbers method

    /**
     * Answer for Question 7, prints time tables
     * 
     * @param c
     */
    public static void L2Q7_TimeTables(Console c) {
        // For loop for printing the time tables
        // Input Processing and Output
        for (int x = 1; x < 7; x++) {
            c.println(
                    x + ": " + (x * 1) + " " + (x * 2) + " " + (x * 3) + " " + (x * 4) + " " + (x * 5) + " " + (x * 6));
        }
    }

    /**
     * Bonus Question
     * Code generates a number and the for loop keeps going until that number is hit
     * Number Restrictions 0 - 100
     * 
     * @param c
     */
    public static void L2Q8_BonusQuestion(Console c) {
        double randNum = Math.random() * 100;
        // System.out.println(randNum);
        int number = (int) randNum;
        // System.out.println(number);
        int x = 0;
        // Processing and Output
        // While loop that loops until it hits a number that satisfies the condition
        while (x != number) {
            c.println(x + " is not the number");
            x++;
        }
        c.println(x + " is the number!");
    }
} // end of Main class
