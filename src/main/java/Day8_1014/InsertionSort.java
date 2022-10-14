package Day8_1014;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 6, 2, 4};
        InsertionSort insertionSort = new InsertionSort();
        int[] result = insertionSort.sort(arr);

        System.out.println(Arrays.toString(result));
    }

    public int[] sort(int[] arr) {
        int i = 1;
        if(arr[i] < arr[i - 1]) {
            int temp = arr[i];
            arr[i] = arr[i - 1];
            arr[i - 1] = temp;
        }
        return arr;
    }
}
