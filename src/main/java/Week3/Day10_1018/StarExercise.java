package Week3.Day10_1018;

public class StarExercise {
    // 정사각형 출력
    public void printSquare(int n) {
        for(int i = 1 ; i <= n ; i ++) {
            for(int j = 1 ; j <= n ; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 직사각형 출력
    public void printRectangle(int x, int y) {
        for(int i = 1 ; i <= x ; i ++) {
            for(int j = 1 ; j <= y ; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        StarExercise starExercise = new StarExercise();
        starExercise.printSquare(5);
        System.out.println("================");
        starExercise.printRectangle(4, 3);
    }
}
