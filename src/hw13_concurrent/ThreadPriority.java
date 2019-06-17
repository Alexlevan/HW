package hw13_concurrent;

public class ThreadPriority implements Runnable {

    public void print() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Downloading is complete");
        }
    }

    @Override
    public void run() {
        print();
    }
}