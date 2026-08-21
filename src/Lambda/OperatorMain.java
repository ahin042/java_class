package Lambda;

import java.util.Scanner;

public class OperatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Operator operator = new Operator();

        operator.add = (int a, int b) -> a + b;
        operator.sub = (int a, int b) -> a - b;
        operator.mul = (int a, int b) -> a * b;
        operator.div = (int a, int b) -> a / b;

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(operator.add.calculate(a, b));
        System.out.println(operator.sub.calculate(a, b));
        System.out.println(operator.mul.calculate(a, b));
        System.out.println(operator.div.calculate(a, b));
    }
}

