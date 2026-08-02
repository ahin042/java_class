package LinkedList;

public class TodoListMain {
    public static void main(String[] args) {
        TodoList todo = new TodoList();
        todo.add("자바 공부하기");
        todo.add("SRS 문서 검토");
        todo.add("PR 리뷰하기");

        todo.show();
        todo.remove(1);
        todo.show();
    }
}
