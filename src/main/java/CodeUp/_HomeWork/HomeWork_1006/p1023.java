package CodeUp._HomeWork.HomeWork_1006;

import java.util.Scanner;

public class p1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println( str.split("\\.")[0] );
        System.out.println( str.split("\\.")[1] );
    }
}
