package Week6.Day24_1109;

import java.util.Arrays;
import java.util.function.BiFunction;

public class SelectionSort_UseFunction {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        // Function<Integer[], Boolean> fn = (arr1) -> arr1[0] > arr1[1];
        // System.out.println(fn.apply(new Integer[]{10, 20}));

        // 오름차순 정렬
        int[] asc = selectionSort(arr.clone(), (a, b) -> a > b);

        // 내림차순 정렬
        int[] desc = selectionSort(arr.clone(), (a, b) -> a < b);

        System.out.println("입력배열 : " + Arrays.toString(arr));
        System.out.println("오름차순 : " + Arrays.toString(asc));
        System.out.println("내림차순 : " + Arrays.toString(desc));

    }

    static int[] selectionSort(int[] arr, BiFunction<Integer, Integer, Boolean> stmt) {

        int n = arr.length;
        for(int i = 0 ; i < n - 1; i ++) {
            int idx = i;

            for(int j = i + 1 ; j < n ; j ++) {
                if(stmt.apply(arr[idx], arr[j])) {
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
