package Week7.Day28_1115;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        sort(0, 7, arr);
    }

    static void sort(int start, int end, int[] arr) {
        int mid = (start + end) / 2;

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i = start ; i <= end ; i ++) {
            if(arr[i] < arr[mid]) {
                left.add(arr[i]);
            } else {
                right.add(arr[i]);
            }
        }

        for(int i : left) {
            System.out.print(i + " ");
        }
        System.out.println();
        for(int i : right) {
            System.out.print(i + " ");
        }
    }
}
