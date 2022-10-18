package CodeUp.HomeWork.HomeWork_1005;

import java.util.Scanner;

public class p1018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int hour = Integer.valueOf(str.split(":")[0]);
        int minute = Integer.valueOf(str.split(":")[1]);
        System.out.println(hour + ":" + minute);
    }
}
