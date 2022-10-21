package CodeUp.Bracket;

import java.util.Scanner;
import java.util.Stack;

public class p3129 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean answer = solve(sc.nextLine());
        if(answer == true) {
            System.out.println("good");
        } else {
            System.out.println("bad");
        }
    }

    static boolean solve(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < str.length() ; i ++) {
            if(str.charAt(i) == '(') {
                stack.push('(');
            } else {
                if(stack.isEmpty()) return false;
                if(stack.peek() == '(') stack.pop();
                else return false;
            }
        }
        if(stack.size() != 0) return false;
        return true;
    }
}
