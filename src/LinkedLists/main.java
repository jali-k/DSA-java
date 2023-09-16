package LinkedLists;

import java.util.LinkedList;

public class main {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        // A link list can be used either as a stack (using push....) or a queue (using offer...)
        linkedList.push("a");
        linkedList.push("c");
        linkedList.push("e");
        linkedList.push("g");
        linkedList.push("i"); // Then this is the top most element

        linkedList.offer("b"); // Anyway add to end => [i, g, e, c, a, b]

        linkedList.remove(2); // remove e

        linkedList.add(2, "e"); // Can add also using index

        // But can't search randomly with an element

        System.out.println( linkedList.get(2)); // But can search by index

        // Advantageous in adding or removing elements

        // But need more memory to store data and, bad in searching with an element

        System.out.println(linkedList);
    }

}
