package __finalProject;
/*
Class Name: Main
Programmer: Ayush
Date Modified: Thursday, January 19 2023 
Description: Class for all the algorithms of the Speed Card Game 
*/

import hsa_ufa.*;
import java.util.*;


public class Game {
    public HashMap<Integer, String[]> cards;
    public HashMap<Integer, String[]> playerCards;
    public HashMap<Integer, String[]> computerCards;
    public HashMap<Integer, String[]> replaceDeck1;
    public HashMap<Integer, String[]> replaceDeck2;
    public HashMap<Integer, String[]> tableCard1;
    public HashMap<Integer, String[]> tableCard2;

    public HashMap<Integer, String[]> playerVisibleCards;
    public HashMap<Integer, String[]> computerVisibleCards;
    public int delaySeconds;
    
    /**
     * Inputs all the cards in the HashMap
     * @param cards
     */
    public void initializingCardsMap(HashMap<Integer, String[]> cards) {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        for (int x = 1; x <= 13; x++) {
            String[] temp = new String[4];
            System.arraycopy(suits, 0, temp, 0, 4);
            cards.put(x, temp);
        }
    }
    /**
     * {@summary} Algorithm to give users their cards
     * @param inputCards
     * @param deckSize
     * @return
     */
    public HashMap<Integer, String[]> distributingCards(HashMap<Integer, String[]> inputCards, int deckSize) {
        HashMap<Integer, String[]> userCards = new HashMap<Integer, String[]>();
        for (int z = 0; z < deckSize; z++) {
            int randomInt = (int) (Math.random() * ((13 - 1) + 1)) + 1; // working getting int between 1 - 13
            String[] availableFaces = inputCards.get(randomInt);
            for (int x = 0; x < 4; x++) {
                // if the suit is available
                if (availableFaces[x] != null) {
                    // handles if the user already has this card
                    if (userCards.containsKey(randomInt)) {
                        String[] currentCards = userCards.get(randomInt);
                        String[] tempArray = new String[4];
                        int y = 0;
                        for (String element : currentCards) {
                            if (element != null) {
                                tempArray[y] = element;
                                y++;
                            }
                        }
                        tempArray[y] = availableFaces[x];
                        userCards.put(randomInt, tempArray); // new modified array
                    } else {
                        String[] tempArr = new String[4];
                        tempArr[0] = availableFaces[x];
                        userCards.put(randomInt, tempArr); // person doesn't have this card yet
                    }
                    // userCards.put(randomInt, availableFaces[x]); // card value and type
                    String[] newMainArr = new String[4];
                    System.arraycopy(availableFaces, 0, newMainArr, 0, 4);
                    newMainArr[x] = null;
                    inputCards.put(randomInt, newMainArr);
                    // availableFaces[x] = null;
                    break;
                } else if (x == 3) {
                    z -= 1; // because a card wasn't inputted
                } else {
                    // z -= 1;
                    continue;
                }
            }
        }
        return userCards;
    }
    /**
     * Gives back the user visible cards (only 5 are accessible at a time)
     * @param cards
     * @param numCards
     * @return
     */
    public HashMap<Integer, String[]> getVisibleCards(HashMap<Integer, String[]> cards, int numCards) {
        HashMap<Integer, String[]> visibleCard = new HashMap<Integer, String[]>();
        int randomInt = (int) (Math.random() * ((13 - 1) + 1)) + 1; // working getting int between 1 - 13
        String[] arr = cards.get(randomInt);
        for (;;) {
            if(arr == null) {
                randomInt = (int) (Math.random() * ((13 - 1) + 1)) + 1;
                arr = cards.get(randomInt);
            } else {
                break;
            }
        }
        // loops z times because numCards are only visible at a time
        for (int z = 0; z < numCards; z++) {
            arr = cards.get(randomInt);
            for(;;) {
                if(arr == null) {
                    randomInt = (int) (Math.random() * ((13 - 1) + 1)) + 1;
                    arr = cards.get(randomInt);
                    continue;
                } else {
                    break;
                }
            }
            // System.out.println("Loop");
            if (arr == null) {
                z -= 1;
                continue;
            }
            for (int x = 0; x < arr.length;) {
                // System.out.println("Index found");
                if(visibleCard.containsKey(randomInt)) {
                    // System.out.println("Have this data already");
                    String[] temp = visibleCard.get(randomInt);
                    for (int y = 0; y < temp.length; y++) {
                        if (temp[y] == null) {
                            // System.out.println("null");
                            temp[y] = arr[x];
                            // break;
                        }
                    }
                    visibleCard.put(randomInt, temp);
                } else {
                    // System.out.println("New Data!");
                    String[] temp = new String[4];
                    temp[0] = arr[x];
                    visibleCard.put(randomInt, temp);
                }
                // making the card inputted unavailable
                String[] newMainArr = new String[4];
                System.arraycopy(arr, 0, newMainArr, 0, 4);
                newMainArr[x] = null;
                cards.put(randomInt, newMainArr); 
                randomInt = (int) (Math.random() * ((13 - 1) + 1)) + 1; // working getting int between 1 - 13
                break;
            }
        }
        return visibleCard;
    }
    /**
     * Method to play a move 
     * @param visibleCards
     * @param tableCard1
     * @param tableCard2
     * @return
     */
    public int playMove(HashMap<Integer, String[]> visibleCards, HashMap<Integer, String[]> tableCard1, HashMap<Integer, String[]> tableCard2) {
        String[] keyArray = (String[]) visibleCards.keySet().toArray();
        for (int x = 0; x < keyArray.length; x++) {
            int output = checkMove(tableCard1, tableCard2, tableCard2);
            if(output == 0) continue;
            else {
                return output;
            }
        }
        return 0;
    }
    /**
     * Checks the computer's move
     * @param tableCard1
     * @param tableCard2
     * @param cardPlayed
     * @return
     */
    public int checkMove(HashMap<Integer, String[]> tableCard1, HashMap<Integer, String[]> tableCard2, HashMap<Integer, String[]> cardPlayed) {
        int accurate = 0;
        int tableCardValue1 = (int) tableCard1.keySet().toArray()[0];
        int tableCardValue2 = (int) tableCard2.keySet().toArray()[0];
        int userCardValue = (int) cardPlayed.keySet().toArray()[0];
        System.out.println(tableCardValue1); 
        System.out.println(tableCardValue2); 
        if(userCardValue == tableCardValue1 - 1 || userCardValue == tableCardValue1 + 1) {
            accurate = 1;
        } else if(userCardValue == tableCardValue2 - 1 || userCardValue == tableCardValue2 + 1) {
            accurate = 2;
        }
        return accurate; // returns index so it tells what table card to replace
    }

    /**
     * {@summary} To make the code sleep for x seconds
     * 
     * @param seconds
     * @throws InterruptedException
     */
    public void delay(int seconds) throws InterruptedException {
        long milliseconds = (long) seconds * 1000;
        Thread.sleep(milliseconds);
    }
    /**
     * Handles the input 
     * @param c
     * @return
     */
    public int input(Console c) {
        c.println(" ");
        c.println("Please enter which card value you want to pick!");
        int cardIndex = c.readInt();
        return cardIndex;
    }
    /**
     * Gets the mastercard HashMap
     * @return
     */
    public HashMap<Integer, String[]> getMasterCards() {
        return this.cards;
    } // end of getMasterCards method
    /**
     * Gets the playerCards HashMap
     * @return
     */
    public HashMap<Integer, String[]> getPlayerCards() {
        return this.playerCards;
    } // end of getPlayerCards method
    /**
     * Gets the computerCards HashMap
     * @return
     */
    public HashMap<Integer, String[]> getComputerCards() {
        return this.computerCards;
    } // end of getComputerCards method
    /**
     * Gets the replaceDeck1 HashMap
     * @return
     */
    public HashMap<Integer, String[]> getReplaceDeck1() {
        return this.replaceDeck1;
    } // end of getReplaceDeck1 method
    /**
     * Gets the replaceDeck2 HashMap
     * @return
     */
    public HashMap<Integer, String[]> getReplaceDeck2() {
        return this.replaceDeck2;
    } // end of getReplaceDeck2 method
    /**
     * Gets the tableCard1 HashMap
     * @return
     */
    public HashMap<Integer, String[]> getTableCard1() {
        return this.tableCard1;
    } // end of getTableCard1 method
    /**
     * Gets the tableCard2 HashMap
     * @return
     */
    public HashMap<Integer, String[]> getTableCard2() {
        return this.tableCard2;
    } // end of getTableCard2 method
    /**
     * Gets the playerVisibleCards HashMap
     * @return
     */
    public HashMap<Integer, String[]> getPlayerVisibleCards() {
        return this.playerVisibleCards;
    } // end of getPlayerVisibleCards method
    /**
     * Gets the computerVisibleCards HashMap
     * @return
     */
    public HashMap<Integer, String[]> getComputerVisibleCards() {
        return this.computerVisibleCards;
    } // end of getComputerVisibleCards method
} // end of Game class