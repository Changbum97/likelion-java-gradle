package CodeUp.HomeWork_1006;

import java.util.Scanner;

public class p1027 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(str.split("\\.")[2] + "-");
        System.out.print(str.split("\\.")[1] + "-");
        System.out.print(str.split("\\.")[0]);
    }
}
