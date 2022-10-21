package Week3.Day13_1021;

public class SolveBracketByReplace {

    boolean solve(String str) {
        while(str.indexOf("()") >= 0) {
            str = str.replace("()", "");
        }
        if(str.length() == 0) return true;
        return false;
    }
}
