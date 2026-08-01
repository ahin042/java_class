package LinkedList;

import java.util.LinkedList;

public class MyQueue {
    LinkedList<Integer> list = new LinkedList<>();

    void enqueue(int sum) {
        list.add(sum);
    }

    void dequeue() {
        System.out.println(list.removeFirst());
    }

    void isEmpty() {
        System.out.println(list.isEmpty());
    }
}