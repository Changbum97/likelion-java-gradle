package Week9.Day36;

import java.util.Arrays;

public class printAlphabet {

    static int cnt = 0;

    public static void main(String[] args) {
        int n = 3;
        char[] c = new char[n];
        Arrays.fill(c, 'A');

        print(0, c);
        System.out.println(cnt);
    }

    static void print(int nowIdx,  char[] c) {
        if(nowIdx == c.length) {
            cnt ++;
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