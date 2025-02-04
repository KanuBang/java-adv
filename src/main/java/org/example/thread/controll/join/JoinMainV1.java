package org.example.thread.controll.join;

import static org.example.thread.util.MyLogger.log;
import static org.example.thread.util.ThreadUtils.sleep;

public class JoinMainV1 {
    public static void main(String[] args) {
        log("start");
        SumTask sumTask1 = new SumTask(1, 50);
        SumTask sumTask2 = new SumTask(51, 100);
        Thread thread1 = new Thread(sumTask1, "thread-1");
        Thread thread2 = new Thread(sumTask2, "thread-2");

        thread1.start();
        thread2.start();



        log("task1.result = " + sumTask1.result);
        log("task2.result = " + sumTask2.result);
        int sumAll = sumTask1.result + sumTask2.result;
        log("task1 + task2 = " + sumAll);
        log("End");

    }

    static class SumTask implements Runnable {
        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("start");
            sleep(2000);
            int sum = 0;
            for(int i = startValue; i <= endValue; i++){
                sum += i;
            }
            result = sum;
            log("작업 완료 result="+result);
        }
    }
}
