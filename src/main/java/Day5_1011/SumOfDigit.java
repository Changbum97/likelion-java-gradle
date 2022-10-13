package Day5_1011;

public class SumOfDigit {
    public int solution(int n) {
        int sum = 0;

        while(n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
    public static void main(String[] args) {
        SumOfDigit sod = new SumOfDigit();

        int result = sod.solution(1234);
        if(result == 10) {
            System.out.println("테스트 통과");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
