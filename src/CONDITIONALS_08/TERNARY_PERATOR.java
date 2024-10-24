package CONDITIONALS_08;

public class TERNARY_PERATOR {
    public static void main(String[] args) {
        int number = 4;

        // ternary operator
        String type = ((number%2) == 0) ? "even" : "odd";
        System.out.println(type);
    }
}
