package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class People {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        System.out.print("사람 수 입력 : ");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print(i + "번째 사람 수 입력 : ");
            String r = scanner.next();
            list.add(r);
        }
        System.out.println("=====명단=====");
        Iterator<String> c = list.iterator();
        while (c.hasNext()) {
            System.out.print(c.next() + " ");
        }
    }
}
