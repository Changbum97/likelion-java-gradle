package Week7.Day27_1114;

public class SieveOfEratosthenesReview {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(50));
    }

    static class Solution {
        public int solution(int n) {
            int answer = 0;
            int[] arr = new int[n + 1];
            for(int i = 2 ; i <= n ; i ++) {
                arr[i] = i;
            }

            for(int j = 4 ; j <= n ; j += 2) {
                arr[j] = 0;
            }

            for(int j = 1 ; j <= n ; j ++) {
                System.out.println(j + " " + arr[j]);
            }
            return answer;
        }
    }
}
