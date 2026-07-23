package GenericsClass;

import java.util.Scanner;

public class MyStackMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyStack myStack = new MyStack();

        System.out.print("Number Of Stack : ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Add Your Stack : ");
            String data = scanner.next();
            myStack.add(data);
        }

        System.out.print("Want To Remove? (yes or no) : ");
        String say = scanner.next();
        if (say == "yes") {
            System.out.print("How Much? (Number) : ");
            a = scanner.nextInt();
            for (int i = 0; i < a; i++) {
                System.out.print("Add Your Stack : ");
                String data = scanner.next();
                myStack.remove(data);
            }
        }
        else if (say == "no") {
            System.out.println("Ok");
        }
        else {
            System.out.println("I can't Understand");
        }

        System.out.println("Want To See? (yes or no) : ");
        say = scanner.next();
        if (say == "yes") {
            System.out.println("Ok");
            myStack.see();
        }
        else if (say == "no") {
            System.out.println("It's Ok");
        }
        else {
            System.out.println("I can't Understand");
        }

        System.out.println("END");
    }
}
