package Day3_1006.CollectionPractice.Set.Random;

import java.util.HashSet;
import java.util.Set;

public class RandomNumberWithoutDuplicated {
    private Set<Integer> randomNumbers = new HashSet<>();

    public RandomNumberWithoutDuplicated(int max) {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        for(int i = 0 ; i < 50 ; i ++) {
            randomNumbers.add(generator.generate(max));
        }
    }

    public Set<Integer> getRandomNumbers() {
        return randomNumbers;
    }
}
