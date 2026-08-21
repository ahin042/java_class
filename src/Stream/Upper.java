package Stream;

import java.util.List;
import java.util.stream.Collectors;

public class Upper {
    public static void main(String[] args) {
        List<String> list = List.of("a","b","c","d","e");

        List<String> result = list.stream()
                .map(n -> n.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
