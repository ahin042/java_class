package HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("철수");
        set.add("영희");
        set.add("철수"); // 중복 허용 X
        System.out.println(set);
    }
}
