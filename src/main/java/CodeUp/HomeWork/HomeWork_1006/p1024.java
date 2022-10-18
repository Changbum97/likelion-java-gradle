package CodeUp.HomeWork.HomeWork_1006;

import java.util.Scanner;

public class p1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i = 0 ; i < str.length() ; i ++) {
            System.out.printf("'%c'\n", str.charAt(i));
        }
    }
}
