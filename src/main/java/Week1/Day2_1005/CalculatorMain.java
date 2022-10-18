package Week1.Day2_1005;

public class CalculatorMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(5, 10);
        System.out.println("5 + 10 = " + calculator.add());
        System.out.println("5 - 10 = " + calculator.minus());
        System.out.println("5 * 10 = " + calculator.multiple());
        System.out.println("5 / 10 = " + calculator.divide());
    }
}
