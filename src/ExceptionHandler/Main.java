package ExceptionHandler;

public class Main {
    public static void main(String[] args) {
        try {
            throw new CustomExceptionBasic("기본 커스텀 예외 테스트");
        }
        catch (CustomExceptionBasic e) {
            System.out.println("1 - " + e.getMessage());
        }

        try {
            throw new ExceptionHierarchy.UserNotFoundException();
        }
        catch (CustomExceptionBasic e) {
            System.out.println("2 - " + e.getMessage());
        }

        MultiCatch multicatch = new MultiCatch();

        for (int i = 0; i < 5; i++) {
            try {
                multicatch.process(i);
            }
            catch (IllegalArgumentException e) {
                System.out.println("type " + i + " 입력값 문제 : " + e.getMessage());
            }
            catch (ExceptionHierarchy.UserNotFoundException e) {
                System.out.println("type " + i + " 구체적으로 먼저 잡힘 : " + e.getMessage());
            }
            catch (RuntimeException e) {
                System.out.println("type " + i + " 포괄적으로 잡힘 : " + e.getMessage());
            }
        }
    }
}
