package CodeUp.HomeWork_1007;

import java.util.Scanner;

public class p1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int hexNumber = Integer.parseInt(str, 16);
        String octalString = Integer.toOctalString(hexNumber);

        System.out.println(octalString);
    }
}
