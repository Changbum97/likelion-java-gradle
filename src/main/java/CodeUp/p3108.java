package CodeUp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class p3108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] students = new String[10001];
        List<Integer> index = new ArrayList<>();

        int n = sc.nextInt();
        for(int j = 0 ; j < n ; j ++) {
            char c = sc.next().charAt(0);
            int num = sc.nextInt();
            String name = sc.next();

            if(c == 'I') {
                if(students[num] == null) {
                    index.add(num);
                }
                students[num] = name;
            } else {
                for (int i = 0 ; i < index.size() ; i ++) {
                    if(index.get(i) == num) {
                        students[num] = null;
                        index.remove(i);
                    }
                }
            }
        }

        Collections.sort(index);
        for(int i = 0 ; i < 5 ; i ++) {
            int findIndex = sc.nextInt() - 1;
            System.out.println(index.get(findIndex) + " " + students[index.get(findIndex)]);
        }
    }
}