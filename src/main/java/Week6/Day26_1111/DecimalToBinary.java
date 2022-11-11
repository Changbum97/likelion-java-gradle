package Week6.Day26_1111;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println(change(10));
        System.out.println(change(16));
        System.out.println(change(31));
        System.out.println(change(49));
    }
    static String change(int n) {
        StringBuilder ans = new StringBuilder();
        while(n != 0) {
            ans.append(n % 2);
            n /= 2;
        }

        return ans.reverse().toString();
    }
}
