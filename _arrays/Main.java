/*
Class Name: Main
Programmer: Ayush
Date Modified: Wednesday, November 30
Description: Class for the submission of 3.6 action problems
*/
package _arrays;
import hsa_ufa.*;
public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        L6Q1abc_BasicArrays(c);
        L6Q2_StudentTimeTable(c);
        L6Q3_MarkAnalyzer(c);
        L6Q4_WhatDayIsIt(c);
        L6Q5_LargestSmallest(c);
        L6Q7_FavouriteNumbers(c);
    } // end of method
    /**
     * Answer to Problem 1
     * @param c
     */
    public static void L6Q1abc_BasicArrays(Console c) {
        int[] candidateVotes = new int[5];
        boolean[] quizQuestions = new boolean[20];
        int[] familySize = new int[11];
    } // end of method
    /**
     * Answer to problem 2
     * @param c
     */
    public static void L6Q2_StudentTimeTable(Console c) {
        String[] arr = {"Math", "English", "Science", "Computer Science"};
        for (int x = 0; x < arr.length; x++) {
            c.println(arr[x]);
        }
    } // end of method
    /**
     * Answer to problem 3
     * @param c
     */
    public static void L6Q3_MarkAnalyzer(Console c) {
        int[] markArray = {70, 55, 80, 92, 10};
        int highestMark = 0;
        // for loop to output marks in the array
        for (int x = 0; x < markArray.length; x++) {
            c.println("#" + (x + 1) + " mark: " + markArray[x]);
            if(markArray[x] > highestMark) {
                highestMark = markArray[x];
            }
        }
        // for loop to update the mark 
        for(;;) {
            c.println("Please input index of the mark you want to update (0 - 4) or any other number to quit");
            int index = c.readInt();
            if(index < 0 || index > 4) {
                break;
            }
            c.println("What mark would you like to update that index to");
            int mark = c.readInt();
            markArray[index] = mark;
            c.println(" ");
        } // end of for loop

    } // end of method
    /**
     * Answer to Problem 5
     * @param c
     */
    public static void L6Q5_LargestSmallest(Console c) {
        c.println("How many numbers would you like to input?");
        int intNums = c.readInt();
        double average = 0;
        int minimum = 0;
        int maximum = 0;
        int[] arr = new int[intNums];
        // for loop to loop through an arrays length to find details about it
        for (int x = 0; x < arr.length; x++) {
            c.println("Input a number");
            arr[x] = c.readInt();
            if(arr[x] > maximum) {
                maximum = arr[x];
            }
            if(arr[x] < minimum) {
                minimum = arr[x];
            }
            average += arr[x];
        } // end of for loop

        average /= arr.length;
        c.println("The average of the numbers you inputted for " + average);
        c.println("The minimum number in your array is " + minimum);
        c.println("The maximum number in your array is " + maximum);
    } // end of method
    /**
     * Bonus Question
     * @param c
     */
    public static void L6Q4_WhatDayIsIt(Console c) {
        String[] arr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for (;;) {
            c.println("Please enter the day of the week you wanna know");
            int index = c.readInt();
            if(index >= 1 && index <= 7) break;
            c.println(arr[index - 1]);
        }
    } // end of method

    /**
     * Bonus Question
     * @param c
     */
    public static void L6Q7_FavouriteNumbers(Console c) {
        c.println("How many favorite numbers do you have?");
        int numFavNums = c.readInt();
        int[] arr = new int[numFavNums];
        int minumum = 0;
        int maximum = 0;
        for(int x = 0;x < numFavNums;x++) {
            c.println("Please enter your favorite numbers");
            int num = c.readInt();
            arr[x] = num; 
            if(arr[x] > maximum) {
                maximum = arr[x];
            }
            if(arr[x] < minumum) {
                minumum = arr[x];
            }
        } // end of for loop

        int randomNum = (int) (Math.random() * (maximum - minumum)) + minumum;

        for (int x = 0; x < arr.length; x++) {
            if(arr[x] < randomNum) {
                arr[x] = -1;
            } else {
                c.println(arr[x]);
            }
        }

    } // end of method
} // end of Main Class