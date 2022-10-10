package _ipo_review;
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
        c.println("Course    Mark"); // 4 spaces 6 chars
        c.println(course1Name + "        " + course1Mark);
        c.println(course2Name + "        " + course2Mark);
        c.println(course3Name + "        " + course3Mark);
        c.println(course4Name + "        " + course4Mark);
        c.println("\nAverage Mark: " + averageMark);
        
    } // end of mark calculator method

    public static void changeCalculator() {
        //Input of changeCalculator

        c.println("Input the cost of your bill");
        double billAmount = c.readDouble();
        c.println("Input the amount of money you are paying with");
        double billPayment = c.readDouble();
        
    }

} // end of class
