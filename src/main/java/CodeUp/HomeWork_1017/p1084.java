package CodeUp.HomeWork_1017;

import java.util.Scanner;

public class p1084 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        for(int i = 0 ; i < r ; i ++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j < g ; j ++) {
                for(int l = 0 ; l < b ; l ++) {
                    sb.append(i).append(" ").append(j).append(" ").append(l).append("\n");
                }
            }
            System.out.print(sb);
        }

        System.out.println(r * g * b);
    }
}
