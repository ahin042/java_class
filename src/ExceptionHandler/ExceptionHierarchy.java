package ExceptionHandler;

public class ExceptionHierarchy {

    public static class UserNotFoundException extends CustomExceptionBasic {
        public UserNotFoundException() {
            super("사용자를 찾을 수 없습니다");
        }
    }

    public static class InvalidPasswordException extends CustomExceptionBasic {
        public InvalidPasswordException() {
            super("비밀번호가 일치하지 않습니다");
        }
    }
}