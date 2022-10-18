package CodeUp.Sort;

import java.util.Scanner;

public class p1443 {

    static int[] sort(int[] arr, int n) {
        for(int i = 1 ; i < n ; i ++) {
            for(int j = i - 1 ; j >= 0 ; j --) {
                if(arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                } else {
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        arr = sort(arr, n);

        for(int i = 0 ; i < n ; i ++) {
            System.out.println(arr[i]);
        }
    }
}
