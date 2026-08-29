package MethodReference;

import java.util.List;

public class NumberMain {
    public static void main(String[] args) {
        List<Number> numbers = List.of(
                new Number("Alice", 20),
                new Number("Bob", 25),
                new Number("Charlie", 30)
        );
        List<NumberResponse> responses = numbers.stream()
                .map(NumberResponse::from)
                .toList();
        responses.forEach(System.out::println);
    }
}