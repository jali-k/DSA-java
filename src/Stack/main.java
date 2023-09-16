package Stack;

import java.util.Stack;

public class main {
    public static void main(String[] args) {
        // Stack is LIFO: last in first out data structure
        // 4 methods with stack
            // 1. push: to add an element on top of the stack
            // 2. pop: to remove the top most element
            // 3. peek: to see the top most element in the stack.
            // 4. search: to search for a particular element.

        // Creating a new String stack

        Stack<String> stack = new Stack<>();

        System.out.println(stack.isEmpty()); // true

        // Adding some elements to the stack

        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println(stack);

        // In a stack, the index of the top most element(lastly added one) is 1

        System.out.println(stack.search("Three"));  // 1

        // pop returns what it pops

        String poppedThing = stack.pop();

        System.out.println(poppedThing); // Three

        System.out.println(stack.peek()); // Two

    }
}
