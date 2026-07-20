package Abstract;

public class Circle extends Shape {
    private double s;
    public Circle(double s) {
        this.s = s;
    }
    double caculateArea() {
        return Math.PI * s * s;
    }
}
