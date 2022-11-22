package Week8.Day32_1122;

public class print1to100 {
    public static void main(String[] args) {
        print(1);
    }
    static void print(int x) {
        if(x == 101) return;

        System.out.println(x);
        print(x + 1);
    }
}
