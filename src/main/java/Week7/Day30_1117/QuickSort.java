package Week7.Day30_1117;

import java.util.Arrays;

public class QuickSort {

    static int[] arr = new int[]{40, 40, 5, 19, 40, 50, 30, 25};

    public static void main(String[] args) {
        sort(0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int start, int end) {
        int left = start;
        int right = end;
        int pivot = arr[(left + right) / 2];

        while(left <= right) {
            while(arr[left] < pivot) left ++;
            while(arr[right] > pivot) right --;

            if(left <= right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left ++;
                right --;
            }
        }

        if(start < right) sort(start, right);
        if(left > end) sort(left, end);
    }
}
