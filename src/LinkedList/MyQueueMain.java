package LinkedList;

import java.util.Scanner;

public class MyQueueMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyQueue myqueue = new MyQueue();
        int a = scanner.nextInt();
        myqueue.enqueue(a);
        myqueue.dequeue();
        myqueue.isEmpty();
    }
}
