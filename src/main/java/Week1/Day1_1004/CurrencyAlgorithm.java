package Week1.Day1_1004;

import java.util.Scanner;

public class CurrencyAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("금액을 입력하세요 : ");
        int x = sc.nextInt();
        int[] arr = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        for(int i = 0 ; i < arr.length ; i ++) {
            System.out.println(arr[i] + "원 : " + x/arr[i] + "개");
            x %= arr[i];
        }
    }
}