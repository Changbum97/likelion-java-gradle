package Week1.Day2_1005.DI_Example;

public class Calculator {
    private int a, b;
    NumberGenerator numberGenerator;
    public Calculator(NumberGenerator numberGenerator, int a) {
        this.numberGenerator = numberGenerator;
        this.a = a;
    }
    public Calculator(NumberGenerator numberGenerator) {
        this.numberGenerator = numberGenerator;
        this.a = 10;
    }

    public void makeB() {
        b = numberGenerator.makeNumber();
    }

    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public int add() {
        return a + b;
    }
    public int minus() {
        return a - b;
    }
    public int multiple() {
        return a * b;
    }
    public double divide() throws Exception {
        if (b == 0) {
            throw new Exception();
        } else {
            return (double) a / b;
        }
    }
}
