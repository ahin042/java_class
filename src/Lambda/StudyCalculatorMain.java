package Lambda;

public class StudyCalculatorMain {
    public static void main(String[] args) {
        StudyCalculator studyCalculator = new StudyCalculator();

        studyCalculator.add = (a,b) -> a + b;
        studyCalculator.sub = (a,b) -> a - b;
        studyCalculator.mul = (a,b) -> a * b;
        studyCalculator.div = (a,b) -> a / b;

        System.out.println(studyCalculator.add.caculate(2,5));
        System.out.println(studyCalculator.sub.caculate(5,2));
        System.out.println(studyCalculator.mul.caculate(2,5));
        System.out.println(studyCalculator.div.caculate(10,2));
    }
}
