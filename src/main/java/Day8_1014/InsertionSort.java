package Day8_1014;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 5, 6, 2, 4};
        InsertionSort insertionSort = new InsertionSort();
        int[] result = insertionSort.sort(arr, 1);

        System.out.println(Arrays.toString(result));
    }

    public int[] sort(int[] arr, int i) {
        if (i == arr.length) return arr;

        for(int j = i - 1 ; j >= 0 ; j --) {
            if(arr[j + 1] < arr[j]) {
                int temp = arr[j + 1];
                arr[j + 1] = arr[j];
                arr[j] = temp;
            } else {
                break;
            }
        }

        return sort(arr, i + 1);
    }
}
