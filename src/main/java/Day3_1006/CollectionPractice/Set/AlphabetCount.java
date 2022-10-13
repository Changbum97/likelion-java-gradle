package Day3_1006.CollectionPractice.Set;

import java.util.HashMap;

public class AlphabetCount {
    public static void main(String[] args) {
        String str = "https://github.com/dongyeon-0822/java-project-exercise";
        HashMap<Character, Integer> alphabetCnt = new HashMap<>();
        for(int i = 0 ; i < 26 ; i ++) {
            alphabetCnt.put( (char) ('A' + i), 0);
        }

        for(int i = 0 ; i < str.length() ; i ++) {
            char c = str.charAt(i);
            if(isAlphabet(c)) {
                if(Character.isLowerCase(c)) {
                    c = Character.toUpperCase(c);
                }
                alphabetCnt.put(c, alphabetCnt.get(c) + 1);
            }
        }

        for(int i = 0 ; i < 26 ; i ++) {
            char c = (char) ('A' + i);
            if(alphabetCnt.get(c) != 0) {
                System.out.println(c + " : " + alphabetCnt.get(c) + "번");
            }
        }
    }

    public static boolean isAlphabet(char c) {
        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ) {
            return true;
        }
        return false;
    }
}