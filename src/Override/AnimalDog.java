package Override;

public class AnimalDog implements Animal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    public static void main(String[] args) {
        AnimalDog dog = new AnimalDog();
        dog.sound();
    }
}
