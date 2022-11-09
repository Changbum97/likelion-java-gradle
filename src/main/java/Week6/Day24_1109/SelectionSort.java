package Week6.Day24_1109;

import java.util.Arrays;

interface SortStrategy {
    boolean compare(int a, int b);
}

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 4, 9, 10, 223, 111, 23, 3, 39};

        // arr을 넘기면 주소값이 넘어가서 기존의 arr 배열도 수정됨
        // => arr.clone()을 넘겨서 기존 arr 배열 유지

        // 오름차순 정렬 => arr[idx] > arr[j]일때 교환 => 작은 수가 앞으로
        int[] asc = selectionSort(arr.clone(), (a, b) -> a > b);

        // 내림차순 정렬 => arr[idx] < arr[j]일때 교환 => 큰 수가 앞으로
        int[] desc = selectionSort(arr.clone(), (a, b) -> a < b);

        System.out.println("입력배열 : " + Arrays.toString(arr));
        System.out.println("오름차순 : " + Arrays.toString(asc));
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
