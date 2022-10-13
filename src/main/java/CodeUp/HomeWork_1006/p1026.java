package CodeUp.HomeWork_1006;

import java.util.Scanner;

public class p1026 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int minute = Integer.parseInt(str.split(":")[1]);
        System.out.println( minute );
    }
}
