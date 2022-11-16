package Week7.Day29_1116;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 40, 50, 5, 25};
        System.out.println(Arrays.toString(sort(arr)));
    }

    static int[] sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int pivot = arr[arr.length / 2];

        while(left < right) {
            if(arr[left] >= pivot && arr[right] <= pivot) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

            if(arr[left] < pivot) {
                left ++;
            }
            if(arr[right] > pivot) {
                right --;
            }

        }
        return arr;
    }
}
