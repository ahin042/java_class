package Generics;

public class Value {
    public static <T> void printValue(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        int intValue = 3;
        double doubleValue = 3.14;
        String stringValue = "안녕";

        printValue(intValue);
        printValue(doubleValue);
        printValue(stringValue);
    }
}
