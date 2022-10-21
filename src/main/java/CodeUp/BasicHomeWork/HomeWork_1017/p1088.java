package CodeUp.BasicHomeWork.HomeWork_1017;

import java.util.Scanner;

public class p1088 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 1 ; i <= x ; i ++) {
            if(i % 3 == 0) continue;

            System.out.print(i + " ");
        }
    }
}
