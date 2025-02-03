package org.example.thread.start;

import static org.example.thread.util.MyLogger.log;

public class ManyThreadMainV2 {
    public static void main(String[] args) {
        log("main() start");
        HelloRunnable helloRunnable = new HelloRunnable();
        for(int i = 0; i < 100; i++) {
            Thread thread = new Thread(helloRunnable);
            thread.start();
        }
        log("main() end");
    }
}
