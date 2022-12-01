package Programmers.exercise;

public class WeaponOfKnights {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(5, 3, 2));
        System.out.println(s.solution(50, 10, 2));
    }
    static class Solution {
        public int solution(int number, int limit, int power) {
            int answer = 0;
            int[] answers = new int[number + 1];
            answers[1] = 1;

            for(int i = 1 ; i <= Math.sqrt(number) ; i ++) {
                for(int j = i + i ; j <= number ; j += i) {
                    if(j == 5) {
                        answers[j] = answers[j];
                    }
                    if(j == i * i) {
                        answers[j] ++;
                    } else if(j / i > i){
                        answers[j] += 2;
                    }
                }
            }

            for(int i = 1 ; i <= number ; i ++) {
                if(answers[i] > limit) {
                    answer += power;
                } else {
                    answer += answers[i];
                }
            }
            return answer;
        }
    }
}
