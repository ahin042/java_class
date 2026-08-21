package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Num {
    public static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        List<Integer> result = numbers.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}