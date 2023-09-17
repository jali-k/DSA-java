package Merge_sort;

public class main {
    public static void main(String[] args) {
        // Merge sort: Divide the array in to two in each iteration
        // Then merge from the bottom in order comparing the same index of each
        // Runtime complexity O(nlog(n))
        // Space complexity O(n)

        int[] array = {6,7,9,8,4,1,2,3,5};

        mergeSort(array);

        for (int a : array){
            System.out.println(a);
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;


        if (length <= 1) return; // Base case

        int[] leftArray = new int[length/2];
        int[] rightArray = new int[length - (int) length/2];

        int i = 0; // left array
        int j = 0; // right array

        for (; i<array.length; i++){
            if (i< leftArray.length){
                leftArray[i] = array[i];

            }else {
                rightArray[j] = array[i];
                j++;
            }
        }

        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);



    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int left = array.length/2;
        int right = array.length - left;
        int i=0, l=0, r=0; // for array, left array and, right array

        while (l<left && r<right){
            if (leftArray[l] < rightArray[r]){ // The order
                array[i] = leftArray[l];
                i++;
                l++;

            }else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < left){
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < right){
            array[i] = rightArray[r];
            i++;
            r++;
        }


    }
}
