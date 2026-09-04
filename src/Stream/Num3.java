package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Num3 {
    public static void main() {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("number : ");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            int c = scanner.nextInt();
            list.add(c);
        }

        List<Integer> result = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
