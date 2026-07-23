package Generics;

import java.util.Scanner;

public class FindTypeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FindType find = new FindType();
        int a = scanner.nextInt();
        String b = scanner.next();
        Double c = scanner.nextDouble();
        System.out.println(find.findtype(a));
        System.out.println(find.findtype(b));
        System.out.println(find.findtype(b));
    }
}
