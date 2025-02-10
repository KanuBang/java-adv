package org.example.thread.executor.test;

import java.util.List;
import java.util.concurrent.*;

import static org.example.thread.util.MyLogger.log;
import static org.example.thread.util.ThreadUtils.sleep;

public class OldOrderService {
    public void order(String orderNo) throws InterruptedException, ExecutionException {
        ExecutorService es = Executors.newFixedThreadPool(3);

        InventoryWork inventoryWork = new InventoryWork(orderNo);
        ShippingWork shippingWork = new ShippingWork(orderNo);
        AccountingWork accountingWork = new AccountingWork(orderNo);

        try {
            Future<Boolean> future1 = es.submit(inventoryWork);
            Future<Boolean> future2 = es.submit(shippingWork);
            Future<Boolean> future3 = es.submit(accountingWork);

            Boolean f1 = future1.get();
            Boolean f2 = future2.get();
            Boolean f3 = future3.get();

            if(f1 && f2 && f3){
                log("성공적");
            } else {
                log("실패(일부 or 모두)");
            }
        } finally {
            es.close();
        }
    }

    static class InventoryWork implements Callable<Boolean> {
        private final String orderNo;

        public InventoryWork(String orderNo) {
            this.orderNo = orderNo;
        }
        @Override
        public Boolean call() {
            log("재고 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class ShippingWork implements Callable<Boolean>{
        private final String orderNo;

        public ShippingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() {
            log("배송 시스템 알림: " + orderNo);
            sleep(1000);
            return true;
        }
    }

    static class AccountingWork implements Callable<Boolean>{
        private final String orderNo;

        public AccountingWork(String orderNo) {
            this.orderNo = orderNo;
        }

        @Override
        public Boolean call() {
            log("회계 시스템 업데이트: " + orderNo);
            sleep(1000);
            return true;
        }
    }

}
