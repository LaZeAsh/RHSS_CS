package __finalProject;
/*
Class Name: Main
Programmer: Ayush
Date Modified: Thursday, January 19 2023 
Description: Class for all the algorithms of the Speed Card Game 
*/

import java.util.*;

public class Game {
    public HashMap<Integer, Integer> cards;
    public HashMap<Integer, Integer> playerCards;
    public HashMap<Integer, Integer> computerCards;
    public HashMap<Integer, Integer> replaceDeck1;
    public HashMap<Integer, Integer> replaceDeck2;
    public HashMap<Integer, Integer> tableCard1;
    public HashMap<Integer, Integer> tableCard2;

    public HashMap<Integer, Integer> playerVisibleCards;
    public HashMap<Integer, Integer> computerVisibleCards;
    public int delaySeconds;
    public int[][] score;
    public int round;
    public String gameWinner;
    public int playerScore;
    public int computerScore;
    public String[] roundResults;

    /**
     * Inputs all the cards in the HashMap
     * 
     * @param cards
     */
    public void initializingCardsMap(HashMap<Integer, Integer> cards) {
        for (int x = 1; x <= 13; x++) {
            // System.arraycopy(suits, 0, temp, 0, 4);
            cards.put(x, 4);
        }
    }

    /**
     * {@summary} Algorithm to give users their cards
     * 
     * @param inputCards
     * @param deckSize
     * @return
     */
    public HashMap<Integer, Integer> distributingCards(HashMap<Integer, Integer> cards, int deckSize) {
        HashMap<Integer, Integer> userCards = new HashMap<Integer, Integer>();
        // how many cards we want in the deck
        for (int z = 0; z < deckSize; z++) {
            int randomInt = (int) (Math.random() * ((13 - 1) + 1)) + 1; // working getting int between 1 - 13
            int availableFaces = cards.get(randomInt);

            if (availableFaces > 0) {
                // indicates that there is faces that can be given out
                if (userCards.containsKey(randomInt)) {
                    // user has had this card previously so give another one
                    int tempInt = userCards.get(randomInt);
                    tempInt++;
                    // 1 less face
                    userCards.put(randomInt, tempInt);
                    cards.put(randomInt, (availableFaces - 1));
                } else {
                    // new number user doesn't have so add it
                    userCards.put(randomInt, 1);
                    // 1 less face
                    cards.put(randomInt, (availableFaces - 1));
                }
            } else {
                // if it's not greater than 0 that means no faces are available and continue
                z -= 1;
                continue;
            }
        }
        return userCards;
    }

    /**
     * Gives back the user visible cards (only 5 are accessible at a time)
     * 
     * @param cards    - The users cards
     * @param numCards
     * @return
     */
    public HashMap<Integer, Integer> getVisibleCards(HashMap<Integer, Integer> cards, int numCards) {
        HashMap<Integer, Integer> visibleCard = new HashMap<Integer, Integer>();
        for (int x = 0; x < numCards; x++) {
            int randomInt = (int) (Math.random() * ((13 - 1) + 1)) + 1; // working getting int between 1 - 13
            // System.out.println(randomInt);
            // account for indexes that don't exist
            int numSuits = 0;
            if (cards.containsKey(randomInt)) {
                numSuits = cards.get(randomInt);
            } else {
                // because suit doesn't exist
                x -= 1;
                continue;
            }
            // System.out.println(numSuits);
            if (numSuits > 0) {
                if (visibleCard.containsKey(randomInt)) {
                    int tempInt = cards.get(randomInt);
                    visibleCard.put(randomInt, (tempInt + 1));
                    cards.put(randomInt, (numSuits - 1));
                } else {
                    visibleCard.put(randomInt, 1);
                    cards.put(randomInt, (numSuits - 1));
                }
            } else {
                // because this suit cant give anymore cards
                x -= 1;
                continue;
            }
        }
        return visibleCard;
    }

    /**
     * Method to play a move
     * 
     * @param visibleCards
     * @param tableCard1
     * @param tableCard2
     * @return
     */
    public int playMove(HashMap<Integer, Integer> visibleCards, HashMap<Integer, Integer> tableCard1,
            HashMap<Integer, Integer> tableCard2) {
        // Object[] keyArray = visibleCards.keySet().toArray();
        // for (int x = 0; x < keyArray.length; x++) {
        // int output = checkMove(tableCard1, tableCard2, tableCard2);
        // if(output == 0) continue;
        // else {
        // return output;
        // }
        // }
        HashMap<Integer, Integer> responseMap = new HashMap<Integer, Integer>();
        int response = 0;
        while (response == 0) {
            // System.out.println(response);
            // visibleCards.forEach((card, count) -> {
            // responseMap.put(card, 1);
            // });
            // responseMap.put((int) visibleCards.keySet().toArray()[0], 1);
            // response = checkMove(tableCard1, tableCard2, responseMap);
            // HashMap<Integer, Integer> tempHash = getVisibleCards(this.computerCards, 1);
            // int visibleCardKey = 0;
            // int temp = 0;
            // visibleCardKey = (int) tempHash.keySet().toArray()[0];
            // if(playerVisibleCards.containsKey(visibleCardKey)) {
            // temp = playerVisibleCards.get(visibleCardKey);
            // temp++;
            // playerVisibleCards.put(visibleCardKey, temp);
            // } else {
            // playerVisibleCards.put(visibleCardKey,
            // tempHash.get(tempHash.keySet().toArray()[0]));
            // }
            // decideWinner("computer", this.round);
            int visibleCardKey = 0;
            for (Object key : visibleCards.keySet().toArray()) {
                responseMap.put((int) key, 1);
                response = checkMove(tableCard1, tableCard2, responseMap);
                if (response == 0) {
                    responseMap.clear();
                    continue;
                } else {
                    visibleCardKey = (int) key;
                    break;
                }
            }
            // response = checkMove(tableCard1, tableCard2, responseMap);
            // if(response == 0) {
            // responseMap.clear();
            // continue;
            // }
            HashMap<Integer, Integer> tempHash = getVisibleCards(this.computerCards, 1);
            // int visibleCardKey = 0;
            int temp = 0;
            // visibleCardKey = (int) tempHash.keySet().toArray()[0];
            if (computerVisibleCards.containsKey(visibleCardKey)) {
                temp = computerVisibleCards.get(visibleCardKey);
                temp++;
                computerVisibleCards.put(visibleCardKey, temp);
            } else {
                computerVisibleCards.put(visibleCardKey, tempHash.get(visibleCardKey));
            }
            return response;
        }
        return 0;
    }

    /**
     * Checks the computer's move
     * 
     * @param tableCard1
     * @param tableCard2
     * @param cardPlayed
     * @return
     */
    public int checkMove(HashMap<Integer, Integer> tableCard1, HashMap<Integer, Integer> tableCard2,
            HashMap<Integer, Integer> cardPlayed) {
        int accurate = 0;
        int tableCardValue1 = (int) tableCard1.keySet().toArray()[0];
        int tableCardValue2 = (int) tableCard2.keySet().toArray()[0];
        int userCardValue = (int) cardPlayed.keySet().toArray()[0];
        // System.out.println(tableCardValue1);
        // System.out.println(tableCardValue2);

        if (userCardValue == tableCardValue1 - 1 || userCardValue == tableCardValue1 + 1) {
            tableCard1.remove(tableCardValue1); // removes
            tableCard1.put(userCardValue, 1); // new table card
            accurate = 1; // returns which table card is accurate
        } else if (userCardValue == tableCardValue2 - 1 || userCardValue == tableCardValue2 + 1) {
            tableCard2.remove(tableCardValue2);
            tableCard2.put(userCardValue, 1);
            accurate = 2; // returns which table card is accurate
        }
        return accurate; // returns index so it tells what table card to replace
    }

    /**
     * {@summary} Used to add score to the user
     */
    public void decideWinner(String person) {
        if(round == this.roundResults.length) {
            
        }
        if (person.equals("player")) {
            // System.out.println("Player score being updated");
            this.roundResults[this.round - 1] = "player";
            // if (round == 1) {
            //     this.score[round - 1][0] = 2;
            //     this.score[round - 1][1] = 0;
            // } else {
            //     this.score[round - 1][0] = this.score[round - 2][0] + 2;
            //     this.score[round - 1][1] = this.score[round - 2][1];
            // }
            this.playerScore += 2;
            // add point to player
        } else if (person.equals("computer")) {
            // add point to computer
            // if (round == 1) {
            //     this.score[round][0] = 0;
            //     this.score[round][1] = 2;
            // } else {
            //     this.score[round][1] = this.score[round - 1][1] + 2;
            //     this.score[round][0] = this.score[round - 1][0];
            // }
            this.computerScore += 2;
            this.roundResults[this.round - 1] = "computer";
        } else if (person.equals("tie")) {
            // if (round == 1) {
            //     this.score[round][0] = 1;
            //     this.score[round][1] = 1;
            // } else {
            //     this.score[round][0] = this.score[round - 1][0] + 1;
            //     this.score[round][1] = this.score[round - 1][1] + 1;
            // }
            this.playerScore += 1;
            this.computerScore += 1;
            this.roundResults[this.round - 1] = "tie"; 
        }
    } // end of decideWinner method

    /**
     * {@summary} To make the code sleep for x seconds
     * 
     * @param seconds
     * @throws InterruptedException
     */
    public void delay(int seconds) throws InterruptedException {
        long milliseconds = (long) seconds * 1000;
        Thread.sleep(milliseconds);
    } // end of delayMethod
    /**
     * Handles the input
     * 
     * @param c
     * @return
     */

    // public int input(Console c) {
    // c.println(" ");
    // c.println("Please enter which card value you want to pick!");
    // int cardIndex = c.readInt();
    // return cardIndex;
    // } // end of input method
    /**
     * Gets the mastercard HashMap
     * 
     * @return
     */
    public HashMap<Integer, Integer> getMasterCards() {
        return this.cards;
    } // end of getMasterCards method

    /**
     * Gets the playerCards HashMap
     * 
     * @return
     */
    public HashMap<Integer, Integer> getPlayerCards() {
        return this.playerCards;
    } // end of getPlayerCards method

    /**
     * Gets the computerCards HashMap
     * 
     * @return
     */
    public HashMap<Integer, Integer> getComputerCards() {
        return this.computerCards;
    } // end of getComputerCards method

    /**
     * Gets the replaceDeck1 HashMap
     * 
     * @return
     */
    public HashMap<Integer, Integer> getReplaceDeck1() {
        return this.replaceDeck1;
    } // end of getReplaceDeck1 method

    /**
     * Gets the replaceDeck2 HashMap
     * 
     * @return
     */
    public HashMap<Integer, Integer> getReplaceDeck2() {
        return this.replaceDeck2;
    } // end of getReplaceDeck2 method

    /**
     * Gets the tableCard1 HashMap
     * 
     * @return
     */
    public HashMap<Integer, Integer> getTableCard1() {
        return this.tableCard1;
    } // end of getTableCard1 method

    /**
     * Gets the tableCard2 HashMap
     * 
     * @return
     */
    public HashMap<Integer, Integer> getTableCard2() {
        return this.tableCard2;
    } // end of getTableCard2 method

    /**
     * Gets the playerVisibleCards HashMap
     * 
     * @return
     */
    public HashMap<Integer, Integer> getPlayerVisibleCards() {
        return this.playerVisibleCards;
    } // end of getPlayerVisibleCards method

    /**
     * Gets the computerVisibleCards HashMap
     * 
     * @return
     */
    public HashMap<Integer, Integer> getComputerVisibleCards() {
        return this.computerVisibleCards;
    } // end of getComputerVisibleCards method

    /**
     * Gets the score 2D array
     * 
     * @return
     */
    public int[][] getScore() {
        return score;
    }
} // end of Game class