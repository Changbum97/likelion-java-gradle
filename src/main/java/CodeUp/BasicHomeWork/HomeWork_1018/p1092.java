package CodeUp.BasicHomeWork.HomeWork_1018;

import java.util.Scanner;

public class p1092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(LCM(a, LCM(b, c)));
    }

    static int LCM(int x, int y) {
        int xx, yy;
        if(x > y) {
            xx = x;
            yy = y;
        } else {
            xx = y;
            yy = x;
        }

        while(true) {
            int z = xx % yy;
            if(z == 0) {
                return x * y / yy;
            }
            xx = yy;
            yy = z;
        }
    }
}
