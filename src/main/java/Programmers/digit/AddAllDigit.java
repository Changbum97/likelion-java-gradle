package Programmers.digit;

import java.util.Scanner;

public class AddAllDigit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println( );

    }

    class Solution {
        public int solution(int n) {
            int sum = 0;

            while(n != 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }
}
