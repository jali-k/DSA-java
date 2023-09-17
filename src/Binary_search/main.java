package Binary_search;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        // Binary search: to search an index of a sorted array of a given target. Half of the array is discarded in each iteration.
        // Good for large data sets cause, O(n) = log(n)

        int[] array = new int[100];

        for (int i=0; i < array.length; i++){
            array[i] = i;
        }

        System.out.println(array.length);

        int target = 48;

        // Easier way is using java inbuilt linearSearch()

//        int index = Arrays.binarySearch(array, target);

        // Implementing own binary search

        int index = binarySearch(array, target);

        if (index >= 0){

            System.out.println("Element found at: " + index);

        } else {
            System.out.println("Element not found");
        }


    }

    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (high - low >= 0){

            int middle = low + (high - low)/2;

            int value = array[middle];
            System.out.println(value);

            if (target > middle){
                low = middle + 1;
            }
            else if (target < middle) {
                high = middle - 1;
            }

            else {
                return value;
            }

        }



        return -1;
    }
}
