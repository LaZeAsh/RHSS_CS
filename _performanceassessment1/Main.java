package _performanceassessment1;
import hsa_ufa.*;
/*
Programmer: Ayush
Date Modified: Monday, October 12 2022
Class Name: 
Description: Class for the solution of the in class programming assignment
*/
public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        supplyOrder(c);
    }
    /**
     * Calculates the order cost and applies a discount then returns the receipt to the user using HSA Console
     * @param c
     */
    public static void supplyOrder(Console c) {
        // Input

        //Inputting the name, quantity, cost, and the amount you paid for the item
        c.println("Please input the name for your 1st item");
        String item1Name = c.readLine();
        c.println("Please input the quantity of your 1st item");
        int item1Quant = c.readInt();
        c.println("Please input the cost of your 1st item");
        double item1Price = c.readDouble();
        c.clear(); // Clears the display
        c.println("Please input the name for your 2nd item");
        String item2Name = c.readLine();
        c.println("Please input the quantity of your 2nd item");
        int item2Quant = c.readInt();
        c.println("Please input the cost of your 2nd item");
        double item2Price = c.readDouble();
        c.println("Enter the amount you paid");
        double amountPaid = c.readDouble();

        // Processing
        
        double totalPriceItem1 = item1Price * item1Quant; // Calculates the total you would be paying for item 1
        double totalPriceItem2 = item2Price * item2Quant; // Calculates the total you would be paying for item 2
        double totalCost = totalPriceItem1 + totalPriceItem2;
        int discount = (int) Math.round(Math.random() * (20 - 5) + 5); // The discount as an integer in percent
        double discountedPrice = totalCost * ((100 - discount) / 100.0); // Calculates the discounted price
        double discountSubtracted = totalCost * (discount / 100.0); // Calculates the amount of money discounted
        double change = amountPaid - discountedPrice; // Calculates the change
        c.clear(); // clear the display

        // Output
        // Outputting the results in a fashionly order

        c.println("              \"School Supply Order\" \n\n");
        c.println("Item\t\tUnit Cost\t  Total");
        c.print(item1Name, 10);
        c.print("\t $");
        c.print(item1Price, 5, 2);
        c.print("\t\t $");
        c.println(totalPriceItem1, 5, 2);
        c.print(item2Name, 10);
        c.print("\t $");
        c.print(item2Price, 5, 2);
        c.print("\t\t $");
        c.println(totalPriceItem2, 5, 2);
        c.println("                                  -------");
        c.print("SUBTOTAL:.........................$ ");
        c.println(totalCost, 4, 2);
        c.print("Discount:.........................$ ");
        c.println(discountSubtracted, 4, 2);
        c.println("                                  -------");
        c.print("                            TOTAL:$ ");
        c.println(discountedPrice, 4, 2);
        c.print("                      Amount Paid:$ ");
        c.println(amountPaid, 6, 2);
        c.print("                           Change:$ ");
        c.println(change, 4, 2);
        
        c.print("Your discount was ");
        c.print(discount, 2);
        c.print("%");
    } // end of method
} // end of class
