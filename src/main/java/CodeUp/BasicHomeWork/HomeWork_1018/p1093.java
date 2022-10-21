package CodeUp.BasicHomeWork.HomeWork_1018;

import java.util.Scanner;

public class p1093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[24];
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i ++) {
            arr[sc.nextInt()] ++;
        }

        for(int i = 1 ; i <= 23 ; i ++) {
            System.out.print(arr[i] + " ");
        }
    }
}
