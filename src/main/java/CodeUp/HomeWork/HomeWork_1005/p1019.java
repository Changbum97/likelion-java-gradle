package CodeUp.HomeWork.HomeWork_1005;

import java.util.Scanner;

public class p1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int year = Integer.valueOf(str.split("\\.")[0]);
        int month = Integer.valueOf(str.split("\\.")[1]);
        int date = Integer.valueOf(str.split("\\.")[2]);
        System.out.printf("%04d.%02d.%02d", year, month, date);
    }
}
