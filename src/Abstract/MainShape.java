package Abstract;
import java.util.Scanner;

public class MainShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("원의 반지름을 입력해주세요 : ");
        double a = scanner.nextDouble();
        System.out.print("정사각형 한 변의 길이를 입력해주세요 : ");
        double b = scanner.nextDouble();
        Circle circle = new Circle(a);
        Square square = new Square(b);
        System.out.println("원의 넓이는 " + circle.caculateArea() + "입니다.");
        System.out.println("정사각형의 넓이는 " + square.caculateArea() + "입니다.");
    }
}
