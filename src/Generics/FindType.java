package Generics;

public class FindType {
    public <T> String findtype(T value) {
        return value.getClass().getName();
    }
}
