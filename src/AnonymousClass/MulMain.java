package AnonymousClass;

import Functional_Interface.Calculator;
import Functional_Interface.CalculatorMain;

import java.util.Scanner;

public class MulMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        Calculator calculator = new CalculatorMain() {
            @Override
            public int calc(int a, int b) {
                return a * b;
            }
        };

        System.out.println(calculator.calc(a,b));
    }
}
