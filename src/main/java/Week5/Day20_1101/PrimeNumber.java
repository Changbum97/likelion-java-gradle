package Week5.Day20_1101;

interface StatementStrategy {
    boolean compare(int a, int b);
}

public class PrimeNumber {
    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        // 13, 17, 19, 23이 소수 인지 판별 => Template Callback 적용

        // lambda 적용, 소수를 구하는 3가지 방법 해보기
        System.out.println(primeNumber.isPrimeNumber(13, (a, b) -> a < b));
        System.out.println(primeNumber.isPrimeNumber(17, (a, b) -> a * 2 < b));
        System.out.println(primeNumber.isPrimeNumber(19, (a, b) -> a * a < b));

        // 익명 클래스 적용
        System.out.println(primeNumber.isPrimeNumber(23, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a * a < b;
            }
        }));
    }

    boolean isPrimeNumber(int num, StatementStrategy stmt) {
        for(int i = 2 ; stmt.compare(i, num) ; i ++) {
            System.out.println(num + " " + i);
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
