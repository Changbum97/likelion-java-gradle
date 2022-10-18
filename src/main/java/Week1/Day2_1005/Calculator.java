package Week1.Day2_1005;

public class Calculator {
    private int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() { return a + b; }
    public int minus() { return a - b; }
    public int multiple() { return a * b; }
    public double divide() { return (double) a/ b ;}
}