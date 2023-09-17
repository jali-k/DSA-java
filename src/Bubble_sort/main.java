package Bubble_sort;

public class main {
    public static void main(String[] args) {
        // Not a very efficient way but, easy to write
        // O(n**2)

        int[] array = {9,4,8,6,7,3,5,2,1};

        bubleSort(array);

        for (int i : array){
            System.out.println(i);
        }
    }

    private static void bubleSort(int[] array) {

        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                if (array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}
