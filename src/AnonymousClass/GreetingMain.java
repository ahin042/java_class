package AnonymousClass;

public class GreetingMain {
    Greeting greeting = new Greeting() {
        @Override
        public void hello() {
            System.out.println("안녕하세요");
        }
    };
    public static void main(String[] args) {
        GreetingMain main = new GreetingMain();
        main.greeting.hello();
    }
}