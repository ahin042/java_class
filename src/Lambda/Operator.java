package Lambda;

public class Operator {
    interface Cacu {
        int calculate(int a, int b);
    }

    Cacu add;
    Cacu sub;
    Cacu mul;
    Cacu div;
}
