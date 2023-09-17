package Quick_sort;

public class main {
    public static void main(String[] args) {
        // Quick sort: Divide the array in to two partitions (not new arrays), where elements smaller than the pivot is in the left side and elements larger than pivot in the right hand side
        // Best case O(nlog(n))
        // Worst case O(n**2)
        // Space complexity O(log(n))

        int[] array = {5, 8, 6, 9, 3, 1, 2, 4, 7};

        quickSort(array, 0, array.length-1);

        for (int a : array){
            System.out.println(a);
        }
    }

    private static void quickSort(int[] array, int start, int end) {

        if (end <= start) return; // Base case

        int pivotIndex = partition(array, 0, end);

        quickSort(array, 0, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, end);
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end];
         int i = start - 1;

         for(int j = start; j <= end - 1; j++){
             if (array[j] < pivot){ // Change the order
                 i++;
                 int temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
             }
         }

         i++;
         int temp = array[i];
         array[i] = array[end];
         array[end] = temp;


        return i;
    }
}
