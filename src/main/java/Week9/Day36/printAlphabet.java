package Week9.Day36;

import java.util.Arrays;

public class printAlphabet {

    public static void main(String[] args) {
        int n = 2;

        char[] c = new char[n];
        Arrays.fill(c, 'A');
        print(0, c);
    }

    static void print(int nowIdx,  char[] c) {
        if(nowIdx == c.length) {
            System.out.println(Arrays.toString(c));
        }

        if(nowIdx < c.length) {
            while(c[nowIdx] <= 'Z') {
                print(nowIdx + 1, c);
                c[nowIdx] ++;
            }
            c[nowIdx] = 'A';
        }
    }
}
