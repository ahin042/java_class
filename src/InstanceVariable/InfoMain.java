package InstanceVariable;

import java.util.Scanner;

public class InfoMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("your name : ");
        String name = scanner.next();

        System.out.print("your age : ");
        int age = scanner.nextInt();

        System.out.print("your school name : ");
        String school = scanner.next();

        Info student = new Info(name,age,school);
        student.Say();
    }
}
