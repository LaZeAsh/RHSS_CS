package __finalProject;
/*
Class Name: Main
Programmer: Ayush
Date Modified: Thursday, January 19 2023
Description: Main file that brings together everything for speed card game
*/
// SPEED CARD GAME
import java.util.*;
import hsa_ufa.*;

class Main {
    public static Game game = new Game();
    static Console c;
    public static void main(String[] aStrings) {
        c = new Console();
        game.cards = new HashMap<Integer, String[]>();
        game.initializingCardsMap(game.cards); // initialized Map of all cards
        game.playerCards = game.distributingCards(game.cards, 20);
        game.computerCards = game.distributingCards(game.cards, 20);
        game.replaceDeck1 = game.distributingCards(game.cards, 5);
        game.replaceDeck2 = game.distributingCards(game.cards, 5);
        game.tableCard1 = game.distributingCards(game.cards, 1);
        game.tableCard2 = game.distributingCards(game.cards, 1);
        game.playerVisibleCards = game.getVisibleCards(game.playerCards, 4);
        game.computerVisibleCards = game.getVisibleCards(game.computerCards, 4);
        game.delaySeconds = startGame(c);

        MultiThreading computerThread = new MultiThreading(game);
        System.out.println("How many rounds do you want to play before the game is called off and there's a stalemate?");
        int rounds = c.readInt();
        // max of 10 and minumum of 1 round
        while(rounds < 0 && rounds > 10) {
            System.out.println("Enter the number of rounds between 0 and 10");
            rounds = c.readInt();
        } 
        // displayCards(); // for visuals lol
        game.input(c); // outside the loop to 
        // System.exit(0); to exit process
        
        for (int x = 0; x < rounds; x++) {
            // print results of the game play (who won computer or user)
            // also present points (2 points for winning 0 points for losing and 1 point for tie [when no one can play on])
            c.println("When you are ready to play on press any key to continue or say 'quit' to quit");
            String response = c.readLine();
            if(response == "quit") {
                goodbye();
            }
            if(game.playerCards.size() == 0 || game.computerCards.size() == 0 || game.replaceDeck1.size() == 0 || game.replaceDeck2.size() == 0) {
                // end game
            }
            if(x == rounds - 1) {
                // how many rounds the user wants to play so end in stalemate after this
                c.println("This is your last round!");
            }
            // print results of previous round (who won)
            if (game.input(c) > 5 || game.input(c) < 1) {
                c.println("Hope you had fun playing! Goodbye!");
            }
            // input code for how the game is going to run
            
            // when asking the user for input start 2nd thread if the user gives an approrpriate response then kill the 2nd thread
            // figure out a way to tell how much time has elapsed since the start of the window where 
            // if winner make a goodbye function
            // store the details of each round in array (clarify in class like what type of details)
            
        }
        c.println("The game is finished! " + rounds + " amount of rounds were played");
        // if loop over that means the amount of rounds is done
        // displayOptions(game.getPlayerVisibleCards());
    } // end of main method

    /**
     * Used to determine difficulty
     * @param c
     * @return
     */
    public static int startGame(Console c) {
        c.println("Hello! What difficulty would you like to play this game in?");
        c.println("Press 1 of the following keys");
        c.println("1 - Easy"); // 7 seconds
        c.println("2 - Medium"); // 5 seconds
        c.println("3 - Hard"); // 3 seconds
        c.println("4 - Impossible"); // 1 second
        c.println("");

        int difficulty = c.readInt();
        int seconds = 0;
        switch(difficulty) {
            case 1:
                seconds = 7; 
                break;
            case 2:
                seconds = 5;
                break;
            case 3:
                seconds = 3;
                break;
            case 4:
                seconds = 1;
                break;
        }

        return seconds;
    } // end of startGame method

    /**
     * {@summary} To make the code sleep for x seconds
     * 
     * @param seconds
     * @throws InterruptedException
     */
    public static void delay(int seconds, Thread computerThread) throws InterruptedException {
        long milliseconds = (long) seconds * 1000;
        Thread.sleep(milliseconds);
    } // end of delay method

    public static void displayCards() {
        c.println("");
        c.println("🂠 🂠 🂠 🂠 🂠");
        c.println(" 🂠 🂡 🂡 🂠");
        c.println("🂠 🂠 🂠 🂠 🂠");
    } // end of displayCards method

    public static void displayOptions(HashMap<Integer, String[]> visibleCards) {
        Object[] keySet = visibleCards.keySet().toArray();
        // String[] temp = visibleCards.get(visibleCards.keySet().toArray()[x]);
        // int length = 0;
        // for (int z = 0; z < temp.length;z++) {
        //     if(temp[z] == null) {
        //         length = z;
        //         break;
        //     }
        // }
        for (int x = 0; x < 5; x++) {
            // underlying issue is we need 5 cards but only get the # that the keyset has
            // to fix this 
            String[] temp = visibleCards.get(visibleCards.keySet().toArray()[x]);
            int length = 0;
            for (int z = 0; z < temp.length;z++) {
                if(temp[z] == null) {
                    length = z;
                    break;
                }
            }
            // System.out.println("Size = " + game.playerVisibleCards.size());
            if (x == 5) {
                c.print(Integer.parseInt((String) keySet[x]) + " ");
                if (length > 1) {
                    c.println(Integer.parseInt((String) keySet[x]));
                } else {
                    c.println("");
                }
                continue;
            }
            c.print((int) keySet[x] + " ");
            System.out.println("String arr length: " + length);
            if (length > 1) {
                c.print((int) visibleCards.keySet().toArray()[x] + " ");
            }
        }
    } // end of displayOptions method

    public static void goodbye() {
        // stats of each player should be shown and declare winner
        // give option to start new game or quit 
    } // end of goodbye method

    public static void outputResults(int[][] results, Console c) {
        // The game stats & winner declaration must be processed and displayed using a command method
        // called outputResults() that uses the information stored in the array that stores the points from
        // each round played.

        for (int x = 0; x < results.length; x++) {
            int playerScore = results[x][0];
            int computerScore = results[x][1];

            if(playerScore > computerScore) {
               c.println("The player has won with a score of " + playerScore); 
               c.println("Congrats!");
            } else {
                c.println("The computer has won with a score of " + computerScore);
                c.println("Better luck next time!");
            }
        }
    } // end of outputResults method
} // end of Main class
