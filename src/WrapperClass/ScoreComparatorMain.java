package WrapperClass;

public class ScoreComparatorMain {
    public static void main(String[] args) {
        ScoreComparator sc = new ScoreComparator();

        System.out.println(sc.getMax(85, 92));
        System.out.println(sc.isEqual(100, 100));
        System.out.println(sc.compare(70, 90));
        System.out.println(sc.getAverage(new int[]{80, 90, 100}));
    }
}