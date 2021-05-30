package Task1;


import java.util.concurrent.Phaser;


public class Hydrogen extends Thread{
    Phaser phaser;
    public Hydrogen(Phaser phaser) {
        this.phaser = phaser;
        start();
    }
    @Override
    public void run() {
        System.out.print("H");
        phaser.arriveAndAwaitAdvance();
    }
}
