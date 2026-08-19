package Override;

public interface Calculator {
    default int calc(int a, int b) {
        return a + b;
    }
}
