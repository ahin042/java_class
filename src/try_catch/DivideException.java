package try_catch;

import java.util.Scanner;

public class DivideException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수 1 : ");
        int a = scanner.nextInt();
        System.out.print("정수 2 : ");
        int b = scanner.nextInt();
        try {
            System.out.print(a + " / " + b + " = ");
            System.out.println(a / b);
        }
        catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }
        finally {
            System.out.println("계산 시도 완료");
        }
    }
}
