package AnonymousClass;

public class Caculator implements Mul{
    public void mul(int a, int b) {
        int c = 0;
        for (int i = 0; i < b; i++) {
            c += a;
        }
        System.out.println(c);
    }
}
