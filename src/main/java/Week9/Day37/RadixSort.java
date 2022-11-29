package Week9.Day37;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RadixSort {
    public static void main(String[] args) {

        int[] arr = new int[]{7, 4, 5, 9, 1, 0, 23, 333};

        int[] digits = getDigits(arr);
        System.out.println(Arrays.toString(digits));

        int[] radixArr = new int[500];
        Arrays.fill(radixArr, -1);

        for(int num : arr) {
            radixArr[num] = num;
        }

        System.out.println(Arrays.toString(radixArr));

        int cnt = 0;
        for(int i = 0 ; i < radixArr.length ; i ++) {
            if(radixArr[i] != -1) {
                arr[cnt ++] = radixArr[i];
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static int[] getDigits(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0 ; i < arr.length ; i ++) {
            if(arr[i] == 0) set.add(1);
            else set.add((int)(Math.log10(arr[i]) + 1));
        }

        int[] answer = new int[set.size()];
        int idx = 0;
        for(Integer num : set) {
            answer[idx ++] = num;
        }
        Arrays.sort(answer);
        return answer;
    }
}
