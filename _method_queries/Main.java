/*
Class Name: Main
Programmer: Ayush
Date Modified: Thursday December 15
Description: Class for the submission of 4.2 action problems
*/
package _method_queries;
import hsa_ufa.*;
public class Main {
    static Console c;
    public static void main(String[] args) {
        // question 1
        c = new Console();
        c.println("Input the degree");
        int q1 = c.readInt();
        c.println(L2Q1_TempConverter(q1) + " farenheit");

        // question 2
        c.println("Input a number");
        int num1 = c.readInt();
        c.println("Input a sign");
        String sign = c.readLine();
        c.println("Input a 2nd number");
        int num2 = c.readInt();
        L2Q2_SimpleCalculatorV2(num1, num2, sign);
        // question 3
        double[] doubleArr = new double[3];
        for (int x = 0; x < 3; x++) {
            c.println("Please provide a double parameters");
            doubleArr[x] = c.readDouble();
        }
        c.println(L2Q3_HighLow(doubleArr));

        // question 5
        c.println("Enter an integer");
        int low = c.readInt();
        c.println("Enter an integer greater than your previous one");
        int max = c.readInt();

        c.println("Enter a double");
        double dlow = c.readDouble();
        c.println("Enter a double greater than your previous one");
        double dmax = c.readDouble();

        c.println(L2Q5_DataValidation(low, max, dlow, dmax));;
    } // end of main method
    /**
     * Converts temp from Celsius to Fahrenheit and other way
     * @param response
     * @return
     */
    public static int L2Q1_TempConverter(int response) {
        c.println("Please enter if you want to convert from farenheit or celsius (f or c)");
        String input = c.readLine();
        // int response = 0;
        if(input.toLowerCase().equals("c")) {
           response = (response * (9/5)) + 32;
        } else if (input.toLowerCase().equals("f")) {
            response = (response - 32) * (5/9);
        }
        return response;
    } // end of tempconverter method
    /**
     * Simple calculator
     */
    public static int L2Q2_SimpleCalculatorV2(int num1, int num2, String sign) {
        if(sign.equals("+")) {
            return addition(num1, num2);
        }
        if (sign.equals("-")) {
            return subtract(num1, num2);
        }
        if (sign.equals("*")) {
            return multiplication(num1, num2);
        }
       if (sign.equals("/")) {
            return (int) division(num1, num2);
       }
       if(sign.equals("%")) {
            return modulusNumber(num1, num2);
       }

       return -1;

    } // end of simple calculator method

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static double division(int a, int b) {
        return (double) a / b;
    }

    public static int modulusNumber(int a, int b) {
        return a % b;
    }

    /**
     * Find max and min in an array
     * @param doubleArr
     * @return
     */ 
    public static String L2Q3_HighLow(double[] doubleArr) {
        double largest = 0;
        double smallest = 0;
        for (int x = 0; x < doubleArr.length; x++) {
            if (doubleArr[x] > largest) {
                largest = doubleArr[x];
            }
            if (doubleArr[x] < smallest) {
                smallest = doubleArr[x];
            }
        }
        return "The highest was " + largest + " the lowest was " + smallest;

    } // end of high low method
    /**
     * Generates a number in a range
     * @param low
     * @param high
     * @param dlow
     * @param dhigh
     * @return
     */
    public static String L2Q5_DataValidation(int low, int high, double dlow, double dhigh) {
        int rangeInt = (int) Math.round(Math.random() * (low - high)) + low;
        double rangeDouble = (double) Math.random() * (dhigh - dlow) + dlow;
        return "The int in the range is " + rangeInt + " the double in the range is " + rangeDouble; 
    } // end of data validation method
}