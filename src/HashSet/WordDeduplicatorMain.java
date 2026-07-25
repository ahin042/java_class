package HashSet;

import java.util.Scanner;

public class WordDeduplicatorMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordDeduplicator word = new WordDeduplicator();

        System.out.print("Number Of Name: ");
        int a = scanner.nextInt();
        for (int i = 0; i < a; i++) {
            System.out.print("Add Name : ");
            String name = scanner.next();
            word.add(name);
        }

        System.out.print("Want To Remove? (yes or no) : ");
        String say = scanner.next();
        if (say == "yes") {
            System.out.print("How Much? (Number) : ");
            a = scanner.nextInt();
            for (int i = 0; i < a; i++) {
                System.out.print("Add Name : ");
                String name = scanner.next();
                word.remove(name);
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
            word.see();
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
