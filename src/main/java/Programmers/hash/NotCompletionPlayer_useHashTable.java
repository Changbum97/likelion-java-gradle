package Programmers.hash;

import java.util.ArrayList;
import java.util.List;

/**
 * 프로그래머스 완주하지 못한 선수 (Hash Table 사용)
 */
public class NotCompletionPlayer_useHashTable {

    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        Solution s = new Solution();
        System.out.println(s.solution(participant, completion));
    }

    static class Solution {
        public String solution(String[] participant, String[] completion) {
            String answer = "";

            for(int i = 0 ; i < participant.length ; i ++) {
                insert(participant[i]);
            }

            for(int i = 0 ; i < completion.length ; i ++) {
                search(completion[i]);
            }

            for(int i = 0 ; i < table.length ; i ++) {
                if(table[i] != null && !table[i].isEmpty()) {
                    answer = table[i].get(0);
                }
            }

            return answer;
        }

        private int size = 10000;
        private List<String>[] table = new ArrayList[size];
        public int hash(String key) {
            int asciiSum = 0;
            for(int i = 0 ; i < key.length() ; i ++) {
                asciiSum += key.charAt(i);
            }
            return asciiSum % size;
        }

        public void insert(String key) {
            int hashIdx = hash(key);
            if(this.table[hashIdx] == null) {
                this.table[hashIdx] = new ArrayList<>();
            }
            this.table[hashIdx].add(key);
        }

        public void search(String key) {
            int hashKey = hash(key);
            for(int i = 0 ; i < this.table[hashKey].size() ; i ++) {
                if(key.equals(this.table[hashKey].get(i))) {
                    this.table[hashKey].remove(i);
                    return;
                }
            }
        }
    }

}
