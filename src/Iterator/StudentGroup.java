package Iterator;

import java.util.Iterator;

public class StudentGroup implements Iterable<String> {
    private String[] students;
    private int count;

    public StudentGroup(int capacity) {
        students = new String[capacity];
        count = 0;
    }

    public void add(String name) {
        students[count] = name;
        count += 1;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public String next() {
                return students[index ++];
            }
        };
    }
}