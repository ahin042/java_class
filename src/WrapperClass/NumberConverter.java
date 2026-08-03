package WrapperClass;

public class NumberConverter {

    // 문자열을 int로 변환
    public int stringToInt(String str) {
        return Integer.parseInt(str);
    }

    // 문자열을 double로 변환
    public double stringToDouble(String str) {
        return Double.parseDouble(str);
    }

    // int를 문자열로 변환
    public String intToString(Integer num) {
        return String.valueOf(num);
    }

    // 숫자로 변환 가능한 문자열인지 확인
    public boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}