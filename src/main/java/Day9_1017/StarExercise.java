package Day9_1017;

public class StarExercise {

    private char letter;

    public StarExercise(char letter) {
        this.letter = letter;
    }

    public static void main(String[] args) {
        StarExercise rt = new StarExercise('*');
        rt.printRhombus(5);
    }

    /*
       *
      ***
     *****
      ***
       *
     */
    public void printRhombus(int n) {
        printPyramid(n);
        for(int i = n - 1 ; i >= 1 ; i --) {
            for(int j = 1 ; j <= n - i ; j ++) {
                System.out.print(" ");
            }
            for(int j = 1 ; j < 2 * i ; j ++) {
                System.out.print(letter);
            }
            System.out.println();
        }

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
                System.out.print(letter);
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
