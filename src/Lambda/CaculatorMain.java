package Lambda;

public class CaculatorMain {
    public static void main(String[] args) {
        Caculator caculator = new Caculator();
        caculator.add = (a, b) -> a + b;
        System.out.println(caculator.add.calculate(3, 4));
    }
}