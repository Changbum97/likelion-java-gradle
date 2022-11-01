package Week5.Day20_1101;

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        // 13, 17, 19, 23이 소수 인지 판별
        System.out.println(primeNumber.isPrimeNumber(13));
        System.out.println(primeNumber.isPrimeNumber(16));
        System.out.println(primeNumber.isPrimeNumber(19));
        System.out.println(primeNumber.isPrimeNumber(23));
    }

    boolean isPrimeNumber(int x) {
        for(int i = 2 ; someOperation(i, x) ; i ++) {
            if(x % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean someOperation(int a, int b) {
        return a < b;
    }
}
