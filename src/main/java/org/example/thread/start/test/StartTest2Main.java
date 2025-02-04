package org.example.thread.start.test;

import static org.example.thread.util.MyLogger.log;

public class StartTest2Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thread = new Thread(counter);
        thread.start();

    }

    static class Counter implements Runnable {
        @Override
        public void run() {
            for(int i = 1; i <=5; i++) {
                log("value: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
