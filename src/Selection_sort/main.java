package Selection_sort;

public class main {
    public static void main(String[] args) {
        // Selection sort: Keeps track of the current minimum value of each iteration
        // Swap it with the starting position

        // Good with small data set
        // Bad with larger dataset
        // O(n**2)

        int[] array = {4,6,8,7,9,5,1,2,3};

        selectionSort(array);

        for(int a : array){
            System.out.println(a);
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[minIndex] > array[j]){
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
}
