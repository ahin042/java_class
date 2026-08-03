package Iterator;

import java.util.List;
import java.util.Scanner;

public class NumberFilterMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFilter filter = new NumberFilter();

        System.out.print("숫자 개수 입력 : ");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print(i + "번째 숫자 입력 : ");
            int n = scanner.nextInt();
            filter.add(n);
        }

        List<Integer> evens = filter.filterEven();
        for (int n : evens) {
            System.out.print(n + " ");
        }
    }
}