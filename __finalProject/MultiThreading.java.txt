package __finalProject;
/*
Class Name: Main
Programmer: Ayush
Date Modified: Thursday, January 19 2023 
Description: Class for the MultiThreading code of the speed card game
*/
import java.lang.Thread;

public class MultiThreading extends Thread {
    private Game game;
    // static Game game = new Game();
    public MultiThreading(Game game) {
        this.game = game;
    }
    @Override
    public void run() {
        try {
            this.game.delay(game.delaySeconds);
        } catch (InterruptedException e) {
            System.out.println(e);
            Thread.currentThread().interrupt();
            return;
        }
        // System.out.println("Made it!");
        int output = this.game.playMove(this.game.computerVisibleCards, this.game.getTableCard1(), this.game.getTableCard2());
        // System.out.println("Done!");
        // System.out.println("Output " + output);
        if(output != 0) {
            game.decideWinner("computer");
            game.gameWinner = "computer"; // computer won
            // System.out.println("Decided computer as winner!");
        } else {
            game.gameWinner = "tie";
        }
    } // end of run method
} // end of MultiThreading class