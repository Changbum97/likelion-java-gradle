package Week9.Day36;

public class printAlphabet {
    public static void main(String[] args) {
        int cnt = 0;
        for(char i = 0 ; i < 26 ; i ++) {
            System.out.printf("%c ", i+'A');
            cnt ++;
        }
        System.out.println("\n" + cnt);

        cnt = 0;
        for(char i = 0 ; i < 26 ; i ++) {
            for(char j = 0 ; j < 26 ; j ++) {
                System.out.printf("%c%c ", i+'A', j+'A');
                cnt ++;
            }
        }
        System.out.println("\n" + cnt);
    }
}
