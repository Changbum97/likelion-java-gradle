package Day2_1005;

public class RandomCalculator {

    private int a, b;

    public RandomCalculator(int a, int b) {
        this.a = a;
        this.b = b;
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

    public double divide() throws ArithmeticException {
        if(b == 0) {
            throw new ArithmeticException();
        }
        return (double) a / b;
    }
}