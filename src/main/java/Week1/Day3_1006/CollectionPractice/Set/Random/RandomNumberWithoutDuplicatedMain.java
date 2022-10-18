package Week1.Day3_1006.CollectionPractice.Set.Random;

public class RandomNumberWithoutDuplicatedMain {
    public static void main(String[] args) {
        int maxNumber = 50;
        RandomNumberWithoutDuplicated randomNumberWithoutDuplicated
                = new RandomNumberWithoutDuplicated(maxNumber);
        System.out.println(randomNumberWithoutDuplicated.getRandomNumbers());
    }
}
