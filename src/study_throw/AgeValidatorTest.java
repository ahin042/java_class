package study_throw;

public class AgeValidatorTest {
    public void checkAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("나이가 유효하지 않습니다");
        }
        System.out.println("유효한 나이입니다: " + age);
    }
}
