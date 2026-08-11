package Lambda;

public abstract class GreetingMain implements Greeting {
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("안녕하세요");
        g.hello();
    }
}
