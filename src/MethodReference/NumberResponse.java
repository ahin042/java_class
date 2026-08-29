package MethodReference;

public class NumberResponse {
    private String name;

    private NumberResponse(String name) {
        this.name = name;
    }

    public static NumberResponse from(Number number) {
        return new NumberResponse(number.getName());
    }

    public String toString() {
        return "NumberResponse{name='" + name + "'}";
    }
}