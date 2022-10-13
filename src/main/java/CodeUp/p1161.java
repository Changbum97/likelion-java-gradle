package CodeUp;

import java.util.Scanner;

public class p1161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(print(x) + "+" + print(y) + "=" + print(x + y));
    }
    static String print(int x) {
        if(x % 2 == 0) {
            return "짝수";
        }
        return "홀수";
    }
}
