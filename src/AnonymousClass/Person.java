package AnonymousClass;

import java.util.Scanner;

class Introduce {
    public void say(String name) {
        System.out.println("당신의 이름은 " + name + "입니다.");
    }
}

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Introduce in = new Introduce();
        System.out.print("이름 : ");
        String me = scanner.next();
        in.say(me);
        Introduce introduce = new Introduce() {
            @Override
            public void say(String name) {
                System.out.println("익명입니다.");
            }
        };
        introduce.say(me);

    }
}
