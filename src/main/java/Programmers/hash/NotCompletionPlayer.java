package Programmers.hash;

import java.util.HashMap;
import java.util.Map;

/**
 * 프로그래머스 완주하지 못한 선수 (HashMap 사용)
 */
public class NotCompletionPlayer {

    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        Solution s = new Solution();
        System.out.println(s.solution(participant, completion));
    }

    static class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";
            Map<String, Integer> map = new HashMap<>();

            /* 선수 추가
            for(int i = 0 ; i < participant.length ; i ++) {
                String name = participant[i];
                if(map.containsKey(name)) {
                    map.put(name, map.get(name) + 1);
                } else {
                    map.put(name, 1);
                }
            }*/

            // 선수 추가 (getOrDefault 메소드 사용)
            for(String name : participant) {
                // 있으면 값 return, 없으면 default값(0) return
                map.put(name, map.getOrDefault(name, 0) + 1);
            }

            // 선수 제거
            for(int i = 0 ; i < completion.length ; i ++) {
                String name = completion[i];
                if(map.containsKey(name)) {
                    int cnt = map.get(name);
                    if(cnt == 1) {
                        map.remove(name);
                    } else {
                        map.put(name, cnt - 1);
                    }
                }
            }

            // map에 마지막 남은것이 정답
            answer = (String) map.keySet().toArray()[0];
            return answer;
        }
    }
}
