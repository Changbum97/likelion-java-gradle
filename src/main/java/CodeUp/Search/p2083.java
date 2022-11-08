package CodeUp.Search;

import java.util.Scanner;

public class p2083 {

    static int findNum;
    static int[] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        arr = new int[n + 1];
        findNum = sc.nextInt();

        for(int i = 1 ; i <= n ; i ++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(binarySearch(1, n));
    }
    static int binarySearch(int left, int right) {
        if(left > right) return -1;

        int mid = (left + right) / 2;
        if(arr[mid] == findNum) return mid;
        else if(arr[mid] > findNum) {
            return binarySearch(left, mid - 1);
        } else {
            return binarySearch(mid + 1, right);
        }
    }
}
