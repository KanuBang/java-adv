package org.example.thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main() start");

        HelloThread helloThread = new HelloThread(); // 스레드를 위한 스택 생성
        System.out.println(Thread.currentThread().getName() + " : start() 호출 전");

        helloThread.start(); // run 메서드를 스택 프레임을 올린다
        System.out.println(Thread.currentThread().getName() + " : start() 호출 후");
        System.out.println(Thread.currentThread().getName() + " : main() end");

    }
}
