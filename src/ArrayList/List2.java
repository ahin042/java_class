package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class List2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            int c = scanner.nextInt();
            list.add(c);
        }

        for (int i : list) {
            for (int n = 0; n < i; n++) {
                for (int m = 0; m <= n; m++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println("------------------");
        }
    }
}
