package try_catch.Finally;

import java.util.Scanner;

public class StringToInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 : ");
        String a = scanner.next();
        try {
            Integer i = Integer.parseInt(a);
            System.out.println(i + "는 숫자입니다");
        }
        catch (NumberFormatException e) {
            System.out.println(a + "는 숫자가 아닙니다");
            System.out.println(e);
        }
        finally {
            System.out.println("프로그램 종료");
        }
    }
}
