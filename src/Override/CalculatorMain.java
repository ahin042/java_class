package Override;

import java.util.Scanner;

public class CalculatorMain {
    class SubCalculator implements Calculator {
        @Override
        public int calc(int a, int b) { return a - b; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator() {
            @Override
            public int calc(int a, int b) {
                return Calculator.super.calc(a, b);
            }
        };
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(calculator.calc(a,b));
    }
}
