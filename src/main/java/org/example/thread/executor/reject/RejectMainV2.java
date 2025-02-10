package org.example.thread.executor.reject;

import org.example.thread.executor.RunnableTask;

import java.util.concurrent.*;

import static org.example.thread.util.MyLogger.log;

public class RejectMainV2 {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(1,1,0, TimeUnit.SECONDS,
                new SynchronousQueue<>(),new ThreadPoolExecutor.DiscardPolicy());

        es.submit(new RunnableTask("task1"));

        try {
            es.submit(new RunnableTask("Task2"));
        } catch (RejectedExecutionException e) {
            log("요청 초과");
            log(e);
        }

        es.close();
    }
}
