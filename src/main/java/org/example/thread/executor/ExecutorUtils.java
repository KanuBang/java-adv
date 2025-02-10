package org.example.thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import static org.example.thread.util.MyLogger.log;

public class ExecutorUtils {
    public static void printState(ExecutorService executorService){
        if(executorService instanceof ThreadPoolExecutor poolExecutor) {
            int pool = poolExecutor.getPoolSize();
            int active = poolExecutor.getActiveCount();
            int queuedTasks = poolExecutor.getQueue().size();
            long completedTask = poolExecutor.getCompletedTaskCount();
            log("[pool=" + pool + ", active=" + active + ", queuedTasks=" +
                    queuedTasks + ", completedTasks=" + completedTask + "]");
            log(executorService);
        }
    }
}
