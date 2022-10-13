package CodeUp;

import java.util.Scanner;

public class p1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n >= 10) {
            int result = 0;
            while(n != 0) {
                result += n % 10;
                n /= 10;
            }
            n = result;
        }

        System.out.println(n);
    }
}
