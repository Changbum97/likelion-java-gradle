package CodeUp._HomeWork.HomeWork_1018;

import java.util.Scanner;

public class p1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10000];
        int n = sc.nextInt();

        for(int i = 0 ; i < n ; i ++) {
            arr[i] = sc.nextInt();
        }

        for(int i = n - 1 ; i >= 0 ; i --) {
            System.out.print(arr[i] + " ");
        }
    }
}
