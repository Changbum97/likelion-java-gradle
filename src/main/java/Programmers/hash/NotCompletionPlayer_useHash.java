package Programmers.hash;

import java.util.ArrayList;
import java.util.List;

public class NotCompletionPlayer_useHash {

    public static void main(String[] args) {
        String[] participant = new String[]{"leo", "kiki", "eden"};
        String[] completion = new String[]{"eden", "kiki"};

        NotCompletionPlayer_useHash n = new NotCompletionPlayer_useHash();
        System.out.println(n.solution(participant, completion));
    }

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
