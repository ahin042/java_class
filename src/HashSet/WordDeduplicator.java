package HashSet;

import java.util.HashSet;

public class WordDeduplicator {
    HashSet<String> set = new HashSet<>();

    void add(String name) {
        set.add(name);
    }

    void see() {
        System.out.println(set);
    }

    void remove(String name) {
        if (set.contains(name)) {
            set.remove(name);
        }
        else {
            System.out.println("I Can't Find");
        }
    }
}
