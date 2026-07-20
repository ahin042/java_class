package Abstract;

public class Square extends Shape {
    private double s;
    public Square(double s) {
        this.s = s;
    }
    double caculateArea() {
        return s * s;
    }
}
