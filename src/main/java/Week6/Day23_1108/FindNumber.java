package Week6.Day23_1108;

import java.util.Scanner;

public class FindNumber {
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
