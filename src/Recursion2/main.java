package Recursion2;

public class main {
    public static void main(String[] args) {
        // Find factorial using recursion

        System.out.println(factorial(7));
    }

    private static int factorial(int num) {
        if (num < 1) return 1; // base case
        return num * factorial(num - 1); // recursive case
    }
}
