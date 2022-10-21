package _repetition_structures;
import hsa_ufa.*;
class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
       L2Q1_Echo(c); 
       L2Q2_TempConverter2(c);
       L2Q3_SellThisHouse(c);
       L2Q4_ImTallerThanYou(c);
       L2Q5_Marks2(c);
    //    L2Q6_PrimeNumbers(c);
    //    L2Q7_TimeTables(c);
    }

    public static void L2Q1_Echo(Console c) {
        int num1 = 0;
        int column = 0;
        // Input / Processing
        // For loop to see if the number satisfied the condition or not
        for (int i = 0; i <= 4; i++) {   
            c.setCursor(1, 1);
            c.println("Input 5 numbers between 1 - 10 (int)");
            num1 = c.readInt();
            if(num1 < 1 || num1 > 10) {
                c.println("Your number did not satisfy the condition");
                break;
            }
            //Output
            c.setCursor(25, column); 
            column++;
            c.println(num1);
        }
    } // end of L21_Echo method

    public static void L2Q2_TempConverter2(Console c) {
        // Getting input
        c.println("Input your temperature in celsius (double)");
        double celsiusTemp = c.readDouble();
        //Calculation
        double farenheitTemp = ((9/5)*celsiusTemp) + 32;
        c.println(celsiusTemp + " in farenheit is " + farenheitTemp);
    } // end of L2Q2_TempConverter2 method

    public static void L2Q3_SellThisHouse(Console c) {
        // Defining / Input
       int initialPrice = 427000;
       int sellPrice = 376000;
       // For loop to calculate the weeks after the price is 376000
       for(int x = 0; ;x++) {
        if(initialPrice == sellPrice) {
            c.println(x + " the number of weeks for the house to sell");
            break;
        }
        initialPrice = (int) Math.round(initialPrice * 0.95);
       }
    }

    public static void L2Q4_ImTallerThanYou(Console c) {
        double height = 0;
        double shortestHeight = 0;
        double tallestHeight = 0;
        double averageHeight = 0;
        // For loop for getting input of the height until negative number
        // Input and Processing
        for(int x = 0;;x++) {
            c.println("Enter a height in meters");
            height = c.readDouble();
            if(height < 0) {
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
    }
    /**
     * Pseudo code needed
     * @param c
     */
    public static void L2Q5_Marks2(Console c) {

    }
    /**
     * Pseudo code needed
     * @param c
     */
    public static void L2Q6_PrimeNumbers(Console c) {

    }

    public static void L2Q7_TimeTables(Console c) {
        // For loop for printing the time tables
        // Input Processing and Output
        for(int x = 1; x < 7; x++) {
            c.println(x + ": " + (x * 1) + " " + (x * 2) + " " + (x * 3) + " " + (x * 4) + " " + (x * 5) + " " + (x * 6));
        }
    }
}

