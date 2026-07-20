package ArrayList;

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add("김철수");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
