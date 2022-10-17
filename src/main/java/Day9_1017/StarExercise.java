package Day9_1017;

public class StarExercise {

    private char letter;

    public StarExercise(char letter) {
        this.letter = letter;
    }

    public static void main(String[] args) {
        StarExercise rt = new StarExercise('*');
        rt.printPyramid(7);
    }

    /*
     *
     ***
     *****
     *******
     */
    public void printPyramid(int n) {
        for(int i = 1 ; i <= n ; i ++) {
            for(int j = 1 ; j <= n - i ; j ++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j < 2 * i ; j ++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /*
     *
     * *
     * * *
     * * * *
     */
    public void printRightTriangle(int n) {
        for(int i = 1 ; i <= n ; i ++) {
            for(int j = 1 ; j <= i ; j ++) {
                System.out.print(letter + " ");
            }
            System.out.println();
        }
    }
}
