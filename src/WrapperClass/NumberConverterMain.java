package WrapperClass;

public class NumberConverterMain {
    public static void main(String[] args) {
        NumberConverter nc = new NumberConverter();

        System.out.println(nc.stringToInt("123"));
        System.out.println(nc.stringToDouble("3.14"));
        System.out.println(nc.intToString(456));
        System.out.println(nc.isNumeric("abc"));
        System.out.println(nc.isNumeric("789"));
    }
}