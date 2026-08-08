package study_throw;

public class AgeValidator {
    public static void main(String[] args) {
        AgeValidatorTest ageValidatorTest = new AgeValidatorTest();
        int[] ages = {25, -5, 200, 30};
        for (int age : ages) {
            try {
                ageValidatorTest.checkAge(age);
            }
            catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
