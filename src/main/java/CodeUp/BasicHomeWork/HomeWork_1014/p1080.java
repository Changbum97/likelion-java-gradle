package CodeUp.BasicHomeWork.HomeWork_1014;

import java.util.Scanner;

public class p1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;
        int i;
        for(i = 1 ; sum < x ; i ++) {
            sum += i;
        }
        System.out.println(i - 1);
    }
}
