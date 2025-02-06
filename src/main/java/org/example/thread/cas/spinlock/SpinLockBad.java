package org.example.thread.cas.spinlock;

import static org.example.thread.util.MyLogger.log;
import static org.example.thread.util.ThreadUtils.sleep;

public class SpinLockBad {
    private volatile boolean lock = false;

    public void lock() {
        log("락 흭득 시도");
        while(true) {
            if(!lock) {
                sleep(100);
                lock = true;
                break;
            } else{
                log("락 흭득 실패 - 스핀 대기");
            }
        }
        log("락 흭득 완료");
    }

    public void unlock() {
        lock = false;
        log("락 반납 완료");
    }
}
