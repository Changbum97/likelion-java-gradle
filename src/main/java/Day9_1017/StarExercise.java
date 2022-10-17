package Day9_1017;

public class StarExercise {

    public static void main(String[] args) {
        StarExercise rt = new StarExercise('@');
        rt.printRightTriangle(4);
    }

    private char letter;

    public StarExercise(char letter) {
        this.letter = letter;
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
