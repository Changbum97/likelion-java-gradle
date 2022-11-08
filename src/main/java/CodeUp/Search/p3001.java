package CodeUp.Search;

import java.util.Scanner;

public class p3001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for(int i = 1 ; i <= n ; i ++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int idx = -1;
        for(int i = 1 ; i <= n ; i ++) {
            if(arr[i] == k) {
                idx = i;
            }
        }

        System.out.println(idx);
    }
}
