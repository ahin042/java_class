package LinkedList;

import java.util.LinkedList;

public class TodoList {
    LinkedList<String> list = new LinkedList<>();

    void add(String data) {
        list.add(data);
    }

    void remove(int number) {
        list.remove(number);
    }

    void show() {
        int num = 1;
        for (String i : list) {
            System.out.println(num + " : " + i);
        }
    }

    void empty() {
        System.out.println(list.isEmpty());
    }
}