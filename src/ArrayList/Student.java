package ArrayList;

import java.util.ArrayList;

public class Student {
    ArrayList<Integer> age = new ArrayList<>();
    ArrayList<String> name = new ArrayList<>();

    void add(Integer age, String name) {
        this.age.add(age);
        this.name.add(name);
        System.out.println("추가되었습니다");
    }

    void get(Integer age, String name) {
        if (this.age.contains(age) && this.name.contains(name)) {
            System.out.println("이름 : " + name);
            System.out.println("나이 : " + age);
        }

        else {
            System.out.println("찾을 수 없습니다");
        }
    }

    void delete(Integer age, String name) {
        this.age.remove(age);
        this.name.remove(name);
        System.out.println("삭제되었습니다.");
    }
}
