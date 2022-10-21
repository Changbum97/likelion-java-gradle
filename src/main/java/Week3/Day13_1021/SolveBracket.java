package Week3.Day13_1021;

import java.util.Scanner;

public class SolveBracket {

    boolean solve(String str) {
        int open = 0;

        for(int i = 0 ; i < str.length() ; i ++) {
            if(str.charAt(i) == '(') {
                open ++;
            } else {
                open --;
                if(open == -1) {
                    return false;
                }
            }
        }
        if(open != 0) {
            return false;
        }
        return true;
    }
}
