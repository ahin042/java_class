package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Num2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            list.add(scanner.nextInt());
        }

        List<Integer> result = list.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(result);
    }
}
