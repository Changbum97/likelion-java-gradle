package Day2_1005.DI_Example;

public class CalculatorMain {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        Calculator calculator1 = new Calculator(new RandomNumberGenerator(), a);

        System.out.println("Random Number 생성 후 계산");
        calculator1.makeB();
        b = calculator1.getB();
        System.out.println("Random Number : " + b);
        System.out.printf("%d + %d = %d\n", a, b, calculator1.add());
        System.out.printf("%d - %d = %d\n", a, b, calculator1.minus());
        System.out.printf("%d * %d = %d\n", a, b, calculator1.multiple());
        try {
            System.out.printf("%d / %d = %f\n\n", a, b, calculator1.divide());
        } catch (Exception e) {
            System.out.println("나누는 숫자가 0입니다.\n\n");
        }

        System.out.println("Specific Number(20) 생성 후 계산");
        Calculator calculator2 = new Calculator(new SpecificNumberGenerator());
        a = calculator2.getA();
        calculator2.makeB();
        b = calculator2.getB();
        System.out.printf("%d + %d = %d\n", a, b, calculator2.add());
        System.out.printf("%d - %d = %d\n", a, b, calculator2.minus());
        System.out.printf("%d * %d = %d\n", a, b, calculator2.multiple());
        try {
            System.out.printf("%d / %d = %f\n", a, b, calculator2.divide());
        } catch (Exception e) {
            System.out.println("나누는 숫자가 0입니다.\n");
        }
    }
}
