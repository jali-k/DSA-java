package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class main {

    public static void main(String[] args) {
        // Queue is a FIFO data structure. Imagine people waiting in a line.
        // Queue is implemented either using linked lists or priority queues.
        // Methods with queue
            // 1. enqueue: Add an item to the tail. Use "offer()" which is a method that do not throw exceptions.
            // 2. Dequeue: Remove an element from the head. Use "poll()" which is a method that do not throw exceptions even if there are no elements

        // Using LinkedList

        Queue<String> queue = new LinkedList<>();

        System.out.println(queue.isEmpty()); // true
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        System.out.println(queue.isEmpty()); // false

        String polled = queue.poll(); // poll() returns what is removed

        System.out.println(polled); // 1

        System.out.println(queue); // [2, 3]

        System.out.println(queue.peek()); // 2

        System.out.println(queue.element()); // 2

        // Since Queue extends Collection, all the methods that is with collections can be used.

        System.out.println(queue.contains("3")); // true: do not return the index

        System.out.println(queue.size()); // 2

        // Using PriorityQueue

        System.out.println("..................................................");

        Queue<String> pqueue = new PriorityQueue<>();
        pqueue.offer("B");
        pqueue.offer("AC");
        pqueue.offer("AB");

        System.out.println(pqueue); // Strings are ordered in alphabetical order and numbers in ascending order





    }
}
