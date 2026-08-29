package MethodReference;

public class Number {
    private String name;
    private int age;

    public Number(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}