package Task1;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Phaser;

public class Test {
    Phaser phaser = new Phaser(3);
    public static final String WATER = "OOHHHH";
    public static void main(String[] args) {
        new Test().makeWater();
    }

    private void makeWater() {
        for (int phase = 0; phase < WATER.length() / 3; phase++) {
            new Hydrogen(phaser);
            new Hydrogen(phaser);
            new Oxygen(phaser);
            phaser.arriveAndAwaitAdvance();
        }
    }
}
