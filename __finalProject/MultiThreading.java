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
        }
        this.game.playMove(this.game.getPlayerVisibleCards(), this.game.getTableCard1(), this.game.getTableCard2());
    } // end of run method
} // end of MultiThreading class