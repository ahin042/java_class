package InstanceVariable;

public class Info {
    String name;
    int age;
    String school;

    public Info(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    void Say() {
        System.out.println("my name is " + name);
        System.out.println("I'm " + age);
        System.out.println("I'm from " + school);
    }
}
