package unit_3_review;
import hsa_ufa.*;
/*
Class Name: Main
Programmer: Ayush
Date Modified: Monday, Oct 31
Description: Class for the submission of the review problems
*/
public class Main {
    static Console c;
    public static void main(String[] args) {
        c = new Console();
        rpsGame(c);
    } // end of main method

    public static void rpsGame(Console c) {
        // defining the scores
        int user1Score = 0;
        int user2Score = 0;
        // For loop to loop through 5 rounds of rps and declare a winner
        for (int x = 0; x < 5; x++) {
            // Generates a random number between 1 - 3
            int user1Result = (int) Math.round(Math.random() * (3 - 1) + 1);
            int user2Result = (int) Math.round(Math.random() * (3 - 1) + 1);
            char user1RPS = 'a';
            char user2RPS = 'a';
            // Processing
            // Switch statement to determine if the user rolled rock paper or scissors
            switch(user1Result) {
            case 1:
                user1RPS = 'r';
                break;
            case 2:
                user1RPS = 'p';
                break;
            case 3:
                user1RPS = 's';
                break;
            }
            // Switch statement to determine if the user rolled rock paper or scissors
            switch(user2Result) {
            case 1:
                user2RPS = 'r';
                break;
            case 2:
                user2RPS = 'p';
                break;
            case 3:
                user2RPS = 's';
                break; 
            }
            // Processing / Output
            if(user1RPS == 'r') {
                // Switch statement to determine who won
                switch(user2RPS) {
                case 'r':
                    user1Score++;
                    user2Score++;
                    c.println("It was a tie! User 1 and 2 both chose rock");
                    c.println("User 1 Score: " + user1Score);
                    c.println("User 2 Score: " + user2Score);
                    c.println(" ");
                    break;
                case 'p':
                    user2Score += 2;
                    c.println("User 2 chose paper and User 1 chose rock, User 2 Wins!");
                    c.println("User 1 Score: " + user1Score);
                    c.println("User 2 Score: " + user2Score);
                    c.println(" ");
                    break; 
                case 's':
                    user1Score += 2;
                    c.println("User 1 chose rock and User 2 chose scissors, User 1 Wins!");
                    c.println("User 1 Score: " + user1Score);
                    c.println("User 2 Score: " + user2Score);
                    c.println(" ");
                    break;
                }
            } else if(user1RPS == 'p') {
                // Switch statement to determine who won
                switch(user2RPS) {
                    case 'p':
                        user1Score++;
                        user2Score++;
                        c.println("It was a tie! User 1 and 2 both chose paper");
                        c.println("User 1 Score: " + user1Score);
                        c.println("User 2 Score: " + user2Score);
                        c.println(" ");
                        break;
                    case 's':
                        user2Score += 2;
                        c.println("User 2 chose scissors and User 1 chose paper, User 2 Wins!");
                        c.println("User 1 Score: " + user1Score);
                        c.println("User 2 Score: " + user2Score);
                        c.println(" ");
                        break;
                    case 'r':
                        user1Score += 2;
                        c.println("User 1 chose paper and User 2 chose rock, User 1 Wins!");
                        c.println("User 1 Score: " + user1Score);
                        c.println("User 2 Score: " + user2Score);
                        c.println(" ");
                        break;
                }
            } else if(user1RPS == 's') {
                // Switch statement to determine who won
                switch(user2RPS) {
                    case 's':
                        user1Score++;
                        user2Score++;
                        c.println("It was a tie! User 1 and 2 both chose scissors");
                        c.println("User 1 Score: " + user1Score);
                        c.println("User 2 Score: " + user2Score);
                        c.println(" ");
                        break;
                    case 'r':
                        user2Score += 2;
                        c.println("User 2 chose rock and User 1 chose scissors, User 2 Wins!");
                        c.println("User 1 Score: " + user1Score);
                        c.println("User 2 Score: " + user2Score);
                        c.println(" ");
                        break;
                    case 'p':
                        user1Score += 2;
                        c.println("User 1 chose scissors and User 2 chose paper, User 1 Wins!");
                        c.println("User 1 Score: " + user1Score);
                        c.println("User 2 Score: " + user2Score);
                        c.println(" ");
                        break;
                }
            }
            // To make a delay so the players can see what's going on in the game
            c.println("Enter any key to continue");
            String uselessVariable = c.readLine();
            c.println(" ");
        }

        // Processing / Output
        // Outputs who won after calculating who won
        if(user1Score > user2Score) {
            c.println("User 1 won! Their score was " + user1Score + " User 2 lost by " + (user1Score - user2Score));
        } else if(user2Score > user1Score) {
            c.println("User 2 won! Their score was " + user2Score + " User 1 lost by " + (user2Score - user1Score));
        } else {
            c.println("It was a tie! Both of them scored " + user1Score);
        }
    } // end of rpsGame class
} // end of Main Class
