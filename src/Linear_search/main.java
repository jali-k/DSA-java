package Linear_search;

public class main {
    public static void main(String[] args) {
        // Linear search: good in small and midium data sets but, not good in large data sets. No need to sort the data set

        int[] numbers = {1, 3, 7, 4, 8, 3, 9, 4, 6};

        var result = linearSearch(numbers,8);

        if(result != -1){
            System.out.println("Element found at index: " + result);
        }else {
            System.out.println("Element not found");
        }
    }

    private static int linearSearch(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] == value){
                return i;
            }
        }
        return -1;
    }


}
