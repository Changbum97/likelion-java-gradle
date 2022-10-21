package Week3.Day13_1021;

import java.util.Stack;

public class SolveBracketByStack {
    boolean solve(String str) {
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
