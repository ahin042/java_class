package ArrayList;

import java.util.Scanner;

public class ShoppingCartMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();
        System.out.println("추가 하고 싶은 물건 수 : ");
        int a = scanner.nextInt();
        for (int i = 0 ; i < a; i++) {
            System.out.print("물건 입력 : ");
            String name = scanner.next();
            shoppingCart.add(name);
        }
        System.out.println("검색 하고 싶은 물건 수 : ");
        a = scanner.nextInt();
        for (int i = 0 ; i < a; i++) {
            System.out.print("물건 입력 : ");
            String name = scanner.next();
            shoppingCart.get(name);
        }
        System.out.println("삭제 하고 싶은 물건 수 : ");
        a = scanner.nextInt();
        for (int i = 0 ; i < a; i++) {
            System.out.print("물건 입력 : ");
            String name = scanner.next();
            shoppingCart.delete(name);
        }
    }
}
