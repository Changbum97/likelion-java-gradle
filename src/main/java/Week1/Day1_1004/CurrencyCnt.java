package Week1.Day1_1004;

public class CurrencyCnt {
    public static void main(String[] args) {
        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;

        int refund = 258900;
        System.out.printf("입력 금액 : %d\n", refund);

        System.out.printf("%d원 : %d개  나머지 : %d원\n", curr50000, refund / curr50000, refund % curr50000);
        refund %= curr50000;
        System.out.printf("%d원 : %d개  나머지 : %d원\n", curr10000, refund / curr10000, refund % curr10000);
        refund %= curr10000;
        System.out.printf("%d원 : %d개  나머지 : %d원\n", curr5000, refund / curr5000, refund % curr5000);
        refund %= curr5000;
        System.out.printf("%d원 : %d개  나머지 : %d원\n", curr1000, refund / curr1000, refund % curr1000);
        refund %= curr1000;
        System.out.printf("%d원 : %d개  나머지 : %d원\n", curr500, refund / curr500, refund % curr500);
    }
}
