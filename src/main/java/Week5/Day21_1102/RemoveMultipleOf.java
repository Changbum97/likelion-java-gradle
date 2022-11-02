package Week5.Day21_1102;

import java.util.ArrayList;
import java.util.List;


// 에라토스테네스의 체
public class RemoveMultipleOf {

    public static void main(String[] args) {
        Solution s = new Solution();
        s.solution(50);
    }

    static class Solution {
        public int solution(int n) {

            List<Integer> nums = new ArrayList<>();
            for(int i = 2 ; i <= n ; i ++) {
                nums.add(i);
            }

            for(int j = 2 ; j * j <= n ; j ++) {
                for(int i = 0 ; i < nums.size() ; i ++) {
                    if(nums.get(i) % j == 0 && nums.get(i) != j) {
                        nums.remove(i);
                    }
                }
            }

            // removeIf 활용
            // nums.removeIf(num -> num % 2 == 0 && num != 2);

            System.out.println("남은 개수 : " + nums.size());
            System.out.println("남은 수 : " + nums);

            return nums.size();
        }
    }
}
