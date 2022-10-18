package Week2.Day6_1012;

interface Calculator {
    double Calculate(int a, int b);
}

public class PolymorphismCalculator {
    private double MakeResult(int a, int b, Calculator calculator) {
        return calculator.Calculate(a, b);
    }

    public double plus(int a, int b) {
        return MakeResult(a, b, new Calculator() {
            @Override
            public double Calculate(int a, int b) {
                return (double)a + b;
            }
        });
    }
    public double minus(int a, int b) {
        return MakeResult(a, b, new Calculator() {
            @Override
            public double Calculate(int a, int b) {
                return (double)a - b;
            }
        });
    }
    public double multiple(int a, int b) {
        return MakeResult(a, b, new Calculator() {
            @Override
            public double Calculate(int a, int b) {
                return (double)a * b;
            }
        });
    }
    public double divide(int a, int b) {
        return MakeResult(a, b, new Calculator() {
            @Override
            public double Calculate(int a, int b) {
                return (double)a / b;
            }
        });
    }

    public static void main(String[] args) {
        PolymorphismCalculator pc = new PolymorphismCalculator();
        int a = 10;
        int b = 7;
        System.out.printf("%d + %d = %d\n", a, b, (int)pc.plus(a, b));
        System.out.printf("%d - %d = %d\n", a, b, (int)pc.minus(a, b));
        System.out.printf("%d * %d = %d\n", a, b, (int)pc.multiple(a, b));
        System.out.printf("%d / %d = %f\n", a, b, pc.divide(a, b));
    }
}