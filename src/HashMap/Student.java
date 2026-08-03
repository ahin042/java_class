package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Student {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> list = new HashMap<>();

        System.out.print("학생 수 :");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            System.out.print("학생 이름 : ");
            String name = scanner.next();
            System.out.print("점수 : ");
            int score = scanner.nextInt();
            list.put(name,score);
        }

        System.out.println("-----명단-----");
        for (Map.Entry<String, Integer> entry : list.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
