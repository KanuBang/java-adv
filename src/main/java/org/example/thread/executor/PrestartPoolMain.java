package org.example.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static org.example.thread.executor.ExecutorUtils.printState;

public class PrestartPoolMain {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(1000);
        printState(es);
        ThreadPoolExecutor poolExecutor = (ThreadPoolExecutor)es;
        poolExecutor.prestartAllCoreThreads();
        printState(es);
    }
}
