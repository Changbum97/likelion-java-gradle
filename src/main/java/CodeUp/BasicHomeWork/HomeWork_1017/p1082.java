package CodeUp.BasicHomeWork.HomeWork_1017;

import java.util.Scanner;

public class p1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int hexNumber = Integer.parseInt(str, 16);

        for(int i = 1 ; i <= 15 ; i ++) {
            System.out.println(str + "*" + Integer.toHexString(i).toUpperCase() + "="
                    + Integer.toHexString(i * hexNumber).toUpperCase());
        }
    }
}
