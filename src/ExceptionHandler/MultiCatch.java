package ExceptionHandler;

public class MultiCatch {

    public void process(int type) {
        if (type == 1) {
            throw new NumberFormatException("숫자 형식이 아닙니다");
        }
        else if (type == 2) {
            throw new IllegalArgumentException("잘못된 인자입니다");
        }
        else if (type == 3) {
            throw new ExceptionHierarchy.UserNotFoundException();
        }
        else if (type == 4) {
            throw new ExceptionHierarchy.InvalidPasswordException();
        }
        else {
            System.out.println("정상적으로 처리 되었습니다");
        }
    }
}