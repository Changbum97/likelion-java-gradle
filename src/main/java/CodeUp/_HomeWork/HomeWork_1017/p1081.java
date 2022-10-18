package CodeUp._HomeWork.HomeWork_1017;

import java.util.Scanner;

public class p1081 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i = 1 ; i <= n ; i ++) {
            for(int j = 1 ; j <= m ; j ++) {
                System.out.println(i + " " + j  );
            }
        }
    }
}
