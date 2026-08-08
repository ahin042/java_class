package try_catch.Finally;

import java.util.ArrayList;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <= 5; i++) {
            list.add(i);
        }
        System.out.print("찾고 싶은 값 위치 입력 : ");
        int find = scanner.nextInt();
        try {
            System.out.print(find + "번째 위치의 값 : ");
            System.out.println(list.get(find));
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스 범위 초과");
            System.out.println(e);
        }
        finally {
            System.out.println("프로그램 종료");
        }
    }
}
