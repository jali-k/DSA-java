package Insertion_sort;

public class main {
    public static void main(String[] args) {
        // Insertion sort: Track values to the left and switch the value to right if the values is grater that current starting index
        // Starts with index 1
        // Better with small datasets
        // Preferable than bubble and selection sort
        // Best case can be run in O(n)
        // Worst case O(n**2)

        int[] array = {5,9,4,7,2,3,1,6,8};

        insertionSort(array);

        for(int a : array){
            System.out.println(a);
        }
    }

    private static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++){
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && temp < array[j]){
                array[j+1] = array[j];
                j--;
            }

//            array[i] = array[j+1];
            array[j+ 1] = temp; // To the generated empty cage
//            array[j] = temp;

        }
    }
}
