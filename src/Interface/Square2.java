package Interface;


public class Square2 implements Shape {
    private double s;
    public Square2(double s) {
        this.s = s;
    }
    public double caculateArea2() {
        return s * s;
    }
    public static void main(String[] args) {
        Square2 square = new Square2(4);
        System.out.println(square.caculateArea2());
    }
}
