package CodeUp.Bracket;

import java.util.Scanner;

public class p4624 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = solve(sc.nextLine());
        System.out.println(ans);
    }

    static int solve(String str) {
        int mul = 1;
        int ans = 0;

        for(int i = 0 ; i < str.length() ; i ++) {
            if(str.charAt(i) == '(') {
                if(str.charAt(i + 1) == ')') {
                    ans += 2 * mul;
                    i ++;
                } else {
                    mul *= 2;
                }
            } else if(str.charAt(i) == '[') {
                if(str.charAt(i + 1) == ']') {
                    ans += 3 * mul;
                    i ++;
                } else {
                    mul *= 3;
                }
            } else if(str.charAt(i) == ')') {
                if(mul % 2 != 0) {
                    return 0;
                } else {
                    mul /= 2;
                }
            } else if(str.charAt(i) == ']') {
                if(mul % 3 != 0) {
                    return 0;
                } else {
                    mul /= 3;
                }
            }
        }
        if(mul != 1) {
            return 0;
        }
        return ans;
    }
}
