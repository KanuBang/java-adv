package org.example.thread.executor.reject;

import org.example.thread.executor.RunnableTask;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

import static org.example.thread.util.MyLogger.log;

public class RejectMainV4 {
    public static void main(String[] args) {
        ExecutorService es = new ThreadPoolExecutor(1,1,0, TimeUnit.SECONDS,
                new SynchronousQueue<>(),new MyRejectedExecutionHandler());

        es.submit(new RunnableTask("task1"));

        try {
            es.submit(new RunnableTask("Task2"));
            es.submit(new RunnableTask("Task3"));
            es.submit(new RunnableTask("Task4"));
            es.submit(new RunnableTask("Task5"));
        } catch (RejectedExecutionException e) {
            log("요청 초과");
            log(e);
        }

        es.close();
    }

    static class MyRejectedExecutionHandler implements RejectedExecutionHandler {
        static AtomicInteger count = new AtomicInteger(0);

        @Override
        public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
            int i = count.incrementAndGet();
            log("[경고] 거절된 누적 작업 수: " + i);
        }
    }
}
