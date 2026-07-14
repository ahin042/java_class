package Override;

public class AnimalDuck implements Animal {
    @Override
    public void sound() {
        System.out.println("꽥꽥");
    }

    public static void main(String[] args) {
        AnimalDuck duck = new AnimalDuck();
        duck.sound();
    }
}
