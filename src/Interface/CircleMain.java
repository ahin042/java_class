package Interface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle<Integer> circle = new Circle<>() {
            @Override
            public void circle(int a) {

            }
        };
        System.out.print("반지름 : ");
        try {
            int a = scanner.nextInt();
            circle.circle(a);
        } catch (InputMismatchException e) {
            System.out.println("숫자가 아닙니다.");
        }
    }
}