package LinkedList;

import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("철수");
        list.add("영희");

        for (String i : list) {
            System.out.println(i);
        }
    }
}
