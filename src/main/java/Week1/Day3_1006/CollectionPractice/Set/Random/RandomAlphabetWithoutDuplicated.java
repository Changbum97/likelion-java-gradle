package Week1.Day3_1006.CollectionPractice.Set.Random;

import java.util.HashSet;
import java.util.Set;

public class RandomAlphabetWithoutDuplicated {
    private Set<Character> randomAlphabets = new HashSet<>();

    public RandomAlphabetWithoutDuplicated(int max) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        for(int i = 0 ; i < 50 ; i ++) {
            randomAlphabets.add((char) (generator.generate(max) + 'A'));
        }
    }

    public Set<Character> getRandomAlphabets() {
        return randomAlphabets;
    }
}
