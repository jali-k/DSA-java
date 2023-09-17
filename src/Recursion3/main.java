package Recursion3;

public class main {
    public static void main(String[] args) {
        // Power(base, exponent) using recursion

        System.out.println(power(2, 5));
    }

    private static int power(int base, int exponent) {
        if (exponent < 1) return 1; // Base case
        return base * power(base, exponent - 1); // Recursive case
    }
}
