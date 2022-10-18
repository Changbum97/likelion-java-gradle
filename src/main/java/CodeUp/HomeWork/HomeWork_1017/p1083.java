package CodeUp.HomeWork.HomeWork_1017;

import java.util.Scanner;

public class p1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1 ; i <= n ; i ++) {
            if(i % 3 == 0) {
                System.out.print("X");
            } else {
                System.out.print(i);
            }
            System.out.print(" ");
        }
    }
}
