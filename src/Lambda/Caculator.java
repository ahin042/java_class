package Lambda;

public class Caculator {
    interface Calc {
        int calculate(int a, int b);
    }

    Calc add;
}