package GenericsClass;

import java.util.ArrayList;

public class MyStack <T> {
    ArrayList<T> stack = new ArrayList<>();

    void add(T data) {
        stack.add(data);
    }

    void remove(T data) {
        if (stack.contains(data)) {
            stack.remove(data);
        }
        else {
            System.out.println("I Can't Find");
        }
    }

    void see() {
        for (T i : stack) {
            System.out.println(i + " ");
        }
    }
}
