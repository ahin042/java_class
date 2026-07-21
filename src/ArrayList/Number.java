package ArrayList;

import java.util.ArrayList;

public class Number {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            number.add(i);
        }
        for (int i : number) {
            System.out.println(i);
        }
    }
}
