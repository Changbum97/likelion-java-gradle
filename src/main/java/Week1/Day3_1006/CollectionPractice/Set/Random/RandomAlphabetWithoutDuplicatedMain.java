package Week1.Day3_1006.CollectionPractice.Set.Random;

public class RandomAlphabetWithoutDuplicatedMain {
    public static void main(String[] args) {
        int maxNumber = 25;
        RandomAlphabetWithoutDuplicated randomAlphabetWithoutDuplicated
                = new RandomAlphabetWithoutDuplicated(maxNumber);
        System.out.println(randomAlphabetWithoutDuplicated.getRandomAlphabets());
    }
}
