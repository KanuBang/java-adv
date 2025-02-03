package org.example.thread.start.test;

import static org.example.thread.util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork(1000),"thread-a");
        Thread threadB = new Thread(new PrintWork(500), "thread-b");
        threadA.start();
        threadB.start();

    }

    static class PrintWork implements Runnable {
        int sec;

        public PrintWork(int sec) {
            this.sec = sec;
        }

        @Override
        public void run() {
            for(int i = 1; i <=5; i++) {
                log("value: " + i);
                try {
                    Thread.sleep(sec);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }

}
