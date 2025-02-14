package org.example.collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println(deque);

        System.out.println(deque.peek());

        System.out.println(deque.pop());
        System.out.println(deque.pop());
        System.out.println(deque);
    }
}
