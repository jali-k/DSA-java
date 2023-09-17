package Interpolation_search;

public class main {
    public static void main(String[] args) {
        // Interpolation search is an improvement of binary search for uniquely distributed data
        // Works very good with uniquely distributed data
        // O(log(log(n)) at the wort case O(n)
        // Guess a probe using the data set and go with it

//        int[] array = {1,2,3,4,5,6,7,8,9, 10, 11, 12};
        int[] array = new int[20];
        int initial = 1;

        for (int i = 0; i < array.length; i++){
            array[i] = initial;
            initial = initial * 2;
            System.out.println(initial);

        }

        int target = 2048;

        int index = interpolationSearch(array, target);

        if (index != -1){
            System.out.println("Element found at: " + index);
        }else {
            System.out.println("Element not found");
        }

    }

    private static int interpolationSearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (target <= array[high] && target >= array[low] && high - low >= 0){

            int probe = low +  (high - low) * (target-array[low])/(array[high] - array[low]);
            System.out.println(probe);

            if(target > array[probe]){
                low = probe + 1;
            } else if(target < array[probe]){
                high = probe - 1;
            }
            else {
                return probe;
            }
        }

        return -1;
    }
}
