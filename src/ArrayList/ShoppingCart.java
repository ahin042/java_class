package ArrayList;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<String> name = new ArrayList<>();

    void add(String name) {
        this.name.add(name);
    }

    void get(String name) {
        if (this.name.contains(name)) {
            System.out.println(name);
        }
        else {
            System.out.println("찾을 수 없습니다.");
        }
    }

    void delete(String name) {
        this.name.remove(name);
    }
}
