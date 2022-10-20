package _repetition_structures;
import hsa_ufa.*;
class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
       L2Q1_Echo(c); 
    //    L2Q2_TempConverter2(c);
    //    L2Q3_SellThisHouse(c);
    //    L2Q4_ImTallerThanYou(c);
    //    L2Q5_Marks2(c);
    //    L2Q6_PrimeNumbers(c);
    //    L2Q7_TimeTables(c);
    }

    public static void L2Q1_Echo(Console c) {
        int num1 = 0;
        int column = 0;
        for (int i = 0; i <= 4; i++) {   
            c.setCursor(1, 1);
            c.println("Input 5 numbers between 1 - 10 (int)");
            num1 = c.readInt();
            if(num1 < 1 || num1 > 10) {
                c.println("Your number did not satisfy the condition");
                break;
            }
            c.setCursor(25, column); 
            column++;
            c.println(num1);
        }
    }

    public static void L2Q2_TempConverter2(Console c) {

    }

    public static void L2Q3_SellThisHouse(Console c) {
        
    }

    public static void L2Q4_ImTallerThanYou(Console c) {

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

    }
}

