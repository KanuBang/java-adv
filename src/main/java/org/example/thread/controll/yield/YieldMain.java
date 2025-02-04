package org.example.thread.controll.yield;

import static org.example.thread.util.ThreadUtils.sleep;

public class YieldMain {
    static final int THREAD_COUNT = 1000;

    public static void main(String[] args) {
        for(int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for(int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + " - " + i);

                //sleep(1000);
                Thread.yield();
            }
        }
    }
}
