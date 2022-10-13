package Day2_1005;

public class RandomCalculatorMain {

    private static final RandomNumberCreator randomNumberCreator = new RandomNumberCreator();
    private static final SpecificNumberCreator specificNumberCreator = new SpecificNumberCreator();
    public static void main(String[] args) {
        int a = specificNumberCreator.makeNumber();
        int randomNumber = randomNumberCreator.makeNumber();

        RandomCalculator randomCalculator = new RandomCalculator(a, randomNumber);
        System.out.printf("%d + %d = %d\n", a, randomNumber, randomCalculator.add());
        System.out.printf("%d - %d = %d\n", a, randomNumber, randomCalculator.minus());
        System.out.printf("%d * %d = %d\n", a, randomNumber, randomCalculator.multiple());

        try {
            System.out.printf("%d / %d = %f", a, randomNumber, randomCalculator.divide());
        } catch(ArithmeticException e) {
            System.out.println("랜덤하게 생성된 숫자가 0입니다.");
        }
    }
}