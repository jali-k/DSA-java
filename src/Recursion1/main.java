package Recursion1;

public class main {
    public static void main(String[] args) {
        // For a recursion we need a base case and a recursive case

        // Let's walk iteratively and recursively

        // Walking iteratively
        walkIter(5);

        // Walking recursively
        walkRecur(5);
    }

    // Walking recursively
    private static void walkRecur(int steps) {

        if (steps < 1 ) return; // Base case
        System.out.println("You took a step");
        walkRecur(steps - 1); // Recursive case

        // In recursive method we add frames to call stack. Hence, in big number of recursions, the call stack can overflow
    }

    // Walking iteratively
    private static void walkIter(int steps) {
        for (int i = 0; i < steps; i++){
            System.out.println("You took a step");
        }
    }
}
