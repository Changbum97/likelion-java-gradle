package CodeUp.HomeWork_1007;

import java.util.Scanner;

public class p1034 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int octalNumber = Integer.parseInt(str, 8);
        int decimalNumber = Integer.parseInt( String.valueOf(octalNumber) );
        System.out.println(decimalNumber);
    }
}
