package Week5.Day21_1102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 에라토스테네스의 체
public class RemoveMultipleOf {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(50);
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;

            List<Integer> list = new ArrayList<>();
            for(int i = 2 ; i <= n ; i ++) {
                list.add(i);
            }

            for(int i = 0 ; i < list.size() ; i ++) {
                if(list.get(i) % 2 == 0) {
                    list.remove(i);
                }
            }

            System.out.println(list.size());
            for(int num : list) {
                System.out.print(num + " ");
            }

            return answer;
        }
    }
}
