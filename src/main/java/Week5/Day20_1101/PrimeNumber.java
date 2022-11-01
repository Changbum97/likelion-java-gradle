package Week5.Day20_1101;

public class PrimeNumber {
    public static void main(String[] args) {
        // 13, 17, 19, 23이 소수 인지 판별
        System.out.println(isPrimeNumber(13));
        System.out.println(isPrimeNumber(16));
        System.out.println(isPrimeNumber(19));
        System.out.println(isPrimeNumber(23));
    }

    static boolean isPrimeNumber(int x) {
        int end = (int)Math.sqrt(x);
        for(int i = 2 ; i <= end ; i ++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
