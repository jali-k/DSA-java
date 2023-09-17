package Hash_tables;

import java.util.Hashtable;

public class main {
    public static void main(String[] args) {
        // Hash table uses a key value pair to store data
        // We have to declare the data type of key and value when defining the hashtable.
        // It calculates a hashcode for each key that depends on the key and the data type of the key. Hashcode is an integer
        // Then it calculates the index that the data goes into in the hash table
        // index = hashcode % capacity of the hash table
        // Each index is concidered as a bucket
        // When two element got the same index, it is known as a collision.
        // At that time the bucket is considered as a linked list.

        // Best case O(1)
        // Worst case O(n)


        Hashtable<Integer, String> table = new Hashtable<>();

        // Use put to add elements to the hash table

        // Better in putting, looking up and deleting elements in a large set of key value pairs
        table.put(100, "Amal");
        table.put(235, "Kamal");
        table.put(458, "Nimal");
        table.put(678, "Sunil");
        table.put(946, "Thilak");

        System.out.println(table.get(100));

        // More efficient when low collisions

        for (int key : table.keySet()){
            System.out.println(table.get(key));
        }





    }
}
