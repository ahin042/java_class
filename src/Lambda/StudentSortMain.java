package Lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentSortMain {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("철수", 85));
        list.add(new Student("영희", 92));
        list.add(new Student("민수", 70));
        list.add(new Student("지영", 95));
        list.add(new Student("동현", 88));

        // 점수 내림차순 정렬
        list.sort((s1, s2) -> s2.getScore() - s1.getScore());

        for (Student s : list) {
            System.out.println(s.getName() + " - " + s.getScore());
        }
    }
}