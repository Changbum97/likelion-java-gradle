package Week3.Day13_1021;

import java.util.Stack;

public class SolveThreeTypeBracketByStack {
    boolean solve(String str) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < str.length() ; i ++) {
            char c = str.charAt(i);

            if(c == '(') {
                stack.push(c);
            } else if(c == '{') {
                stack.push(c);
            } else if(c == '[') {
                stack.push(c);
            } else if(c == ')') {
                if(stack.isEmpty() || stack.peek() != '(') return false;
                stack.pop();
            } else if(c == '}') {
                if(stack.isEmpty() || stack.peek() != '{') return false;
                stack.pop();
            } else if(c == ']') {
                if(stack.isEmpty() || stack.peek() != '[') return false;
                stack.pop();
            }
        }
        if(stack.size() != 0) return false;
        return true;
    }
}
