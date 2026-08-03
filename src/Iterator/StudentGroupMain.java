package Iterator;

public class StudentGroupMain {
    public static void main(String[] args) {
        StudentGroup group = new StudentGroup(5);
        group.add("people1");
        group.add("people2");
        group.add("people3");

        for (String name : group) {
            System.out.println(name);
        }
    }
}