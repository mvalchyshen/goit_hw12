package Task2;

public class Main {
    public static void main(String[] args) {
        MyThreadPoolExecutor myThreadPoolExecutor = new MyThreadPoolExecutor(1);
        myThreadPoolExecutor.execute(new MyRunnable());
        myThreadPoolExecutor.shutdown();
    }
}
