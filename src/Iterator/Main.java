package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            number.add(i);
        }
        Iterator<Integer> i = number.iterator();
        while (i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }
}
