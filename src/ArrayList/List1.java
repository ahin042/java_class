package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class List1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int c = scanner.nextInt();
            if (c % 2 == 0) {
                list.add(c);
            } else {
                continue;
            }
        }

        for (int i : list) {
            System.out.println(i);
        }
    }
}
