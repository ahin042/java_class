package Functional_Interface;

public abstract class CalculatorMain implements Calculator{
    public static void main(String[] args) {
        Calculator calculator = new CalculatorMain() {
            @Override
            public int calc(int a, int b) {
                return 0;
            }
        };
        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;

        System.out.println(add.calc(5, 3));
        System.out.println(sub.calc(5, 3));
    }
}
