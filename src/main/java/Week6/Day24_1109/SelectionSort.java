package Week6.Day24_1109;

import java.util.Arrays;

interface SortStrategy {
    boolean compare(int a, int b);
}

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        // 오름차순 정렬
        int[] asc = selectionSort(arr, (a, b) -> a > b);
        System.out.println("오름차순 : " + Arrays.toString(asc));

        // 내림차순 정렬
        int[] desc = selectionSort(arr, (a, b) -> a < b);
        System.out.println("내림차순 : " + Arrays.toString(desc));

    }

    static int[] selectionSort(int[] arr, SortStrategy stmt) {
        int n = arr.length;
        for(int i = 0 ; i < n - 1; i ++) {
            int idx = i;

            for(int j = i + 1 ; j < n ; j ++) {
                if(stmt.compare(arr[idx], arr[j])) {
                    idx = j;
                }
            }

            if(i != idx) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
            }
        }

        return arr;
    }
}
