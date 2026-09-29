package GetterSetter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Info info = new Info();
        System.out.print("money : ");
        int a = scanner.nextInt();
        info.setMoney(a);
        System.out.println("-------------");
        System.out.print("your money : ");
        System.out.println(info.getMoney());
    }
}
