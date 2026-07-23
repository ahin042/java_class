package ArrayList;

import java.util.Scanner;

public class StudentListMain {
    public static void main(String[] args) {
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("추가 하고 싶은 인원 수 : ");
        int a = scanner.nextInt();
        for (int i = 0 ; i < a; i++) {
            System.out.print("나이 입력 : ");
            int age = scanner.nextInt();
            System.out.print("이름 입력 : ");
            String name = scanner.next();
            student.add(age,name);
        }
        System.out.println("검색 하고 싶은 인원 수 : ");
        a = scanner.nextInt();
        for (int i = 0 ; i < a; i++) {
            System.out.print("나이 입력 : ");
            int age = scanner.nextInt();
            System.out.print("이름 입력 : ");
            String name = scanner.next();
            student.get(age,name);
        }
        System.out.println("삭제 하고 싶은 인원 수 : ");
        a = scanner.nextInt();
        for (int i = 0 ; i < a; i++) {
            System.out.print("나이 입력 : ");
            int age = scanner.nextInt();
            System.out.print("이름 입력 : ");
            String name = scanner.next();
            student.delete(age,name);
        }
    }
}
