package Week9.Day38;

import java.util.Scanner;

public class LCA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(lca(x, y));
    }
    static int lca(int x, int y) {
        if(x == y) return 0;

        if(x > y) {
            return 1 + lca(x / 2, y);
        } else {
            return 1 + lca(x, y / 2);
        }
    }
}
