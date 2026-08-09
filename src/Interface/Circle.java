package Interface;

public abstract class Circle<T extends Number> implements MakeCircle<T> {
    public void circle(T a) {
        try {
            double val = a.doubleValue();
            System.out.println(val * val * 3.14);
        }
        catch (ArithmeticException e) {
            System.out.println("Not a number");
        }
    }
}