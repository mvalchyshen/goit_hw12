package Task2;

@Repeat(count = 4)
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("HELLO WORLD!!!");
    }
}
