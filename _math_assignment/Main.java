package _math_assignment;
/*
Class Name: Main
Programmer: Ayush
Date Modified: Monday, October 3 2022
Description: Class for all the submissions of Module 2.5 Math assignment
*/
import hsa_ufa.*;
public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        whosFaster(c);
    }   

    /**
     * Calculates the volume of your prism using the input you provide
     * @param c
     */
    public static void volumeCalculator(Console c) {
        c.println("Input the height of your cube (int)");
        int cubeHeight = c.readInt();
        c.println("Input the width of your cube (int)");
        int cubeWidth = c.readInt();
        c.println("Input the length of your cube (int)");
        int cubeLength = c.readInt();

        int cubeVolume = cubeHeight * cubeWidth * cubeLength;

        c.println("The volume of the cube is " + cubeVolume);
    } // end of volumeCalculator method
    /**
     * Gives you the hypotenuse of your right triangle
     * @param c
     */
    public static void hypotenuseCalculator(Console c) {
        c.println("Input the length of your triangle (int)");
        int triangleLength = c.readInt();
        c.println("Input the width of your triangle (int)");
        int triangleWidth = c.readInt();

        int hypotenuse = (int) Math.sqrt((triangleLength * triangleLength) + (triangleWidth * triangleWidth));

        c.println("The hypotenuse of your right triangle is " + hypotenuse);
    } // end of hypotenuseCalculator method
    /**
     * Converts your temperature from Celsius to Farenheit
     * @param c
     */
    public static void temperatureConverter(Console c) {
        c.println("Input your temperature in celsius (double)");
        double celsiusTemp = c.readDouble();
        double farenheitTemp = ((9/5)*celsiusTemp) + 32;
        
        c.println(celsiusTemp + " in farenheit is " + farenheitTemp);
    } // end of temperatureConverter method
    /**
     * Converts your temperature from Farenheit to Celsius
     * @param c
     */
    public static void temperatureConverter2(Console c) {
        c.println("Input your temperature in farenheit (double)");
        double farenheitTemp = c.readDouble();
        double celsiusTemp = (farenheitTemp - 32) * 0.5556;

        c.println(farenheitTemp + " in celsius is " + celsiusTemp);
    } // end of temperatureConverter2 method
    /**
     * Converts inches to cm
     * @param c
     */
    public static void measurementConverter(Console c) {
        c.println("Enter your measurement in inches (double)");
        double inches = c.readDouble();
        double calculations = inches * 2.54;
        c.println(Math.round((calculations * 100) / 100) + " cm equals " + inches + " inches (rounded to 2 decimal places)");
    } // end of measurementConverter method
    /**
     * Tells you how old are you according to your birth year
     * @param c
     */
    public static void howOld(Console c) {
        c.println("Enter your birthyear (int)");
        int birthYear = c.readInt();
        int calculations = 2022 - birthYear;

        c.println("You are currently " + calculations + " years old!");
    } // end of howOld method
    /**
     * Tells you who's faster by asking for distance and time
     * @param c
     */
    public static void whosFaster(Console c) {
        //getting input
        c.println("Input Person 1's distance in km (double)");
        double person1Distance = c.readDouble();
        c.println("Input Person 1's time in minutes (int)");
        int person1Time = c.readInt();
        c.println("Input Person 2's distance in km (double)");
        double person2Distance = c.readDouble();
        c.println("Input Person 2's time in minutes (int)");
        int person2Time = c.readInt();
        //Calculation of person1Speed and person2Speed
        double person1Speed = person1Distance / person1Time;
        double person2Speed = person2Distance / person2Time;

        if(person1Speed > person2Speed) {
            c.println("Person 1 was faster and their speed was " + person1Speed + " km/m");
        } else if(person2Speed > person1Speed) {
            c.println("Person 2 was faster and their speed was " + person2Speed + " km/m");
        } else {
            c.println("Person 1 and Person 2 had same speed and their speed was " + person1Speed + " km/m");
        }
    } // end of whosFaster method
    /**
     * Outputs the last digit of your number
     * @param c
     */
    public static void lastDigit(Console c) {
        c.println("Input a random integer! (int)");
        int randInt = c.readInt();
        int lastInt = randInt % 10;

        c.println(lastInt + " is the last digit of " + randInt);
    } // end of lastDigit method
    /**
     * Bonus Question 
     * @param c
     */
    public static void bonusQuestion(Console c) {
        int agreementPercent = 0;
        c.println("Is your favorite food pizza or pasta");
        String q1 = c.readLine();
        c.println("Is your favorite color red or blue");
        String q2 = c.readLine();
        c.println("Do you like the summer or winter");
        String q3 = c.readLine();
        c.println("Is your favorite drink coke or pepsi");
        String q4 = c.readLine();
        if(q1.toLowerCase().equals("pizza")) {
            agreementPercent += 25;
        }

        if(q2.toLowerCase().equals("red")) {
            agreementPercent += 25;
        }

        if(q3.toLowerCase().equals("summer")) {
            agreementPercent += 25;
        }

        if(q4.toLowerCase().equals("coke")) {
            agreementPercent += 25;
        }

        c.println("Ayush agrees with you " + agreementPercent + "% of the times!");
    } // end of bonusQuestion method
} // end of Main Class
