package org.example.thread.executor.poolsize;

import org.example.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static org.example.thread.executor.ExecutorUtils.printState;
import static org.example.thread.util.MyLogger.log;
import static org.example.thread.util.ThreadUtils.sleep;

public class PoolSizeMainV2 {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);

        log("pool 생성");
        printState(es);

        for(int i=1; i<=6; i++) {
            String taskName = "task"+i;
            es.execute(new RunnableTask(taskName));
            printState(es,taskName);
        }

        es.close();
        log("== shutdown 완료 ==");
    }
}
