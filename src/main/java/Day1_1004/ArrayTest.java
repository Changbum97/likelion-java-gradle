package Day1_1004;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0 ; i < 10 ; i ++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}