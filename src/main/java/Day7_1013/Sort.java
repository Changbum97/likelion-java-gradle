package Day7_1013;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 2, 3, 9, 28, 11};
        Sort sort = new Sort();

        System.out.println(Arrays.toString( sort.sort(arr) ));
    }

    public int[] sort(int[] arr) {
        for(int i = 0 ; i < arr.length - 1 ; i ++) {
            for(int j = i + 1 ; j < arr.length ; j ++) {
                if(arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
