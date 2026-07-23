package GenericsClass;

import java.util.ArrayList;

public class StudyBox <T> {
    ArrayList<T> box = new ArrayList<>();

    void add(T name) {
        box.add(name);
    }

    void see() {
        for (T i : box) {
            System.out.print(i + " ");
        }
    }
}
