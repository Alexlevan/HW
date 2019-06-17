package hw13_concurrent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestDownloader {
    public static void main(String[] args) {
        ExecutorService ex = Executors.newCachedThreadPool();
        ex.execute(new Downloader("https://..."));
        ex.execute(new Downloader("https://..."));
        ex.execute(new Downloader("https://..."));


        Thread attributedThread = new Thread(new ThreadPriority(),"Priority of thread");
        attributedThread.setPriority(Thread.MAX_PRIORITY);
        attributedThread.start();
        System.out.println(attributedThread.getName() + " : " + attributedThread.getPriority());
    }
}
