package Week6.Day22_1107;

public class HashadNumber {

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10));
        System.out.println(s.solution(11));
        System.out.println(s.solution(12));
        System.out.println(s.solution(13));
    }

    static class Solution{
        public boolean solution(int x) {
            int sum = 0;

            int temp = x;
            while(temp != 0) {
                sum += temp % 10;
                temp /= 10;
            }

            if(x % sum == 0) {
                return true;
            }
            return false;
        }
    }
}
