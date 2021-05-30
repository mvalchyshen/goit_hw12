package Task1;


import java.util.concurrent.Phaser;

public class Oxygen extends Thread{
    Phaser phaser;

    public Oxygen(Phaser phaser) {
        this.phaser = phaser;
        start();
    }

    @Override
    public void run() {
        System.out.print("O");
        phaser.arriveAndAwaitAdvance();
    }
}
