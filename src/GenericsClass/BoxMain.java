package GenericsClass;

public class BoxMain {
    public static void main(String[] args) {
        BoxInteger boxInteger = new BoxInteger();
        boxInteger.setData(3);

        BoxString boxString = new BoxString();
        boxString.setData("java");

        BoxGenerics<Integer> box1 = new BoxGenerics<>();
        box1.setData(2);

        BoxGenerics<String> box2 = new BoxGenerics<>();
        box2.setData("java");
    }
}
