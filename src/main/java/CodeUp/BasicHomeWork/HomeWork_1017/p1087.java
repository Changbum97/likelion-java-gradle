package CodeUp.BasicHomeWork.HomeWork_1017;

import java.util.Scanner;

public class p1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int sum = 0;

        for(int i = 0 ; sum < x ; i ++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
