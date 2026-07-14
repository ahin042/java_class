package This;
import java.util.Scanner;

public class MeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Me me  = new Me();
        System.out.print("이름을 입력해주세요 : ");
        String add = scanner.next();
        me.myname(add);
        me.say();
    }
}
