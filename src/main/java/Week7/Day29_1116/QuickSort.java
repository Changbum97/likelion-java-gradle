package Week7.Day29_1116;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{40, 60, 5, 19, 40, 50, 30, 25};
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
                left ++;
                right --;
            }

            if(arr[left] < pivot) left ++;
            if(arr[right] > pivot) right --;
        }

        System.out.println("pivot : " + pivot);

        System.out.print("left group : ");
        for(int i = 0 ; i < left ; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("right group : ");
        for(int i = left ; i < arr.length ; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return arr;
    }
}
