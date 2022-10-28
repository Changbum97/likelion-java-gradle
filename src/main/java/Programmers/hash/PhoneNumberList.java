package Programmers.hash;

import java.util.HashSet;
import java.util.Set;

/**
 * 프로그래머스 전화번호 목록
 */
public class PhoneNumberList {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(s.solution(new String[]{"123", "456", "789"}));
        System.out.println(s.solution(new String[]{"12", "123", "1235", "567", "89"}));
    }

    static class Solution {
        public boolean solution(String[] phone_book) {
            Set<String> set = new HashSet<>();

            for(String phone_number : phone_book) {
                // 같은 번호가 있으면 false return
                if(set.contains(phone_number)) return false;

                set.add(phone_number);
            }

            // 시간복잡도 : 1,000,000 * 20 * 1(HashSet search)
            for(String phone_number : phone_book) {
                StringBuilder sb = new StringBuilder();

                // 현재 전화 번호가 1234라면 => 1, 12, 123 중 하나라도 겹치면 false return
                for(int i = 0 ; i < phone_number.length() - 1 ; i ++) {
                    sb.append(phone_number.charAt(i));
                    if(set.contains(sb.toString())) {
                        return false;
                    }
                }
            }

            return true;
        }
    }
}
