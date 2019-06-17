package hw13_concurrent;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

public class Downloader implements Runnable{
    private final String url;

    public Downloader(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        download();
    }

    private synchronized void download() {
        try (BufferedInputStream add = new BufferedInputStream(new URL(url).openStream())) {
            add.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
