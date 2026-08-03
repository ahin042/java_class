package WrapperClass;

public class ScoreComparator {

    public int getMax(int score1, int score2) {
        if (score1 > score2) {
            return score1;
        }
        else {
            return score2;
        }
    }

    public boolean isEqual(Integer score1, Integer score2) {
        return score1.equals(score2);
    }

    public int compare(Integer score1, Integer score2) {
        if (score1 > score2) {
            return -1;
        }
        if (score1.equals(score2)) {
            return 0;
        }
        else {
            return 1;
        }
    }

    // 평균 점수 계산 (배열 받아서)
    public double getAverage(int[] scores) {
        int c = 0;
        for (int i : scores) {
            c += i;
        }
        return Integer.parseInt(String.valueOf(c / scores.length));
    }
}