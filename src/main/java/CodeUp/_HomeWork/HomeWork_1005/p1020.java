package CodeUp._HomeWork.HomeWork_1005;

import java.util.Scanner;

public class p1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String first = str.split("-")[0];
        String second = str.split("-")[1];
        System.out.println(first + second);
    }
}
