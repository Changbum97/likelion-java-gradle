package Week6.Day24_1109;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(selectionSort(new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39})));
    }

    static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n - 1; i ++) {
            int min = arr[i];
            int minIdx = i;

            for(int j = i + 1 ; j < n ; j ++) {
                if(min > arr[j]) {
                    min = arr[j];
                    minIdx = j;
                }
            }

            System.out.println(i + " : " + minIdx);

            if(i != minIdx) {
                int temp = arr[i];
                arr[i] = arr[minIdx];
                arr[minIdx] = temp;
            }
        }

        return arr;
    }
}
