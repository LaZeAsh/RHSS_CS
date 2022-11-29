/*
Programmer: Ayush
Date Modified: Wednesday, November 9, 2022
Class Name: EvenOddGame 
Description: Class for the solution of activity 3.2 
*/
package _performanceassessment2;
import hsa_ufa.Console;

public class EvenOddGame {
    static Console c;

    public static void main(String[] args) {
        c = new Console();
        // execution of the evenOddGame method
        evenOddGame(c);
    }
    /**
     * Class for the solution to the programming assignment
     * @param c
     */
    public static void evenOddGame(Console c) {
        // defining necessary variables needed for this game
        c.println("Please enter the number of the rounds in this game (int)");
        int numRounds = c.readInt();
        int randomInt = 0;
        int playerWins = 0;
        int computerWins = 0;

        for (int i = 1; i < (numRounds + 1); i++) {
            // Input
            randomInt = (int) (Math.random() * 100); // Generating a random integer from the ranges 0 - 100
            c.println("Please guess if the number is going to be even or odd (e for even, o for odd)");
            String input = c.readLine(); // Getting input of the user
            c.println(" ");
            // If statement to check if the input is valid or not
            if (!input.equals("o") && !input.equals("e")) {
                c.println("Please enter a valid input!");
                return;
            }

            // Output / Processing
            // Checks if the user inputted even or odd for the output
            String evenOrOdd = "";
            if (input.equals("o")) {
                evenOrOdd = "odd";
            } else if(input.equals("e")) {
                evenOrOdd = "even";
            }
            c.println("Round " + i);
            c.println("The player guessed " + evenOrOdd);
            c.println("The random number generated was " + randomInt);
            // Number is even if it's divisible by 2
            if (randomInt % 2 == 0) {
                // Switch statement to tell who won
                switch (input) {
                    case "e":
                        c.println("Player wins this round!");
                        playerWins++;
                        break;
                    case "o":
                        c.println("Computer wins this round!");
                        computerWins++;
                        break;
                } // end of switch statement
            } else {
                // Switch statement to tell who won
                switch (input) {
                    case "e":
                        c.println("Computer wins this round!");
                        computerWins++;
                        break;
                    case "o":
                        c.println("Player wins this round!");
                        playerWins++;
                        break;
                } // end of switch statement
            }
            // Continuation of the output
            c.println("Player has " + playerWins + " win(s)");
            c.println("Computer has " + computerWins + " win(s)");
            c.println("Press a random key to continue"); 
            String randomString = c.readLine(); // So the program pauses before it begins the next round
            c.println(" ");
        } // end of for loop
        // Output the final decision of who won 
        c.println("Player has " + playerWins + " win(s)");
        c.println("Computer has " + computerWins + " win(s)");
        // Statements to check who won
        if (playerWins > computerWins) {
            c.println("The player wins!");
        } else if (computerWins > playerWins) {
            c.println("The computer wins!");
        } else {
            c.println("Hmm... Looks like it's a tie! Nobody wins!");
        }
    } // end of evenOddGame method
} // end of EvenOddGame class