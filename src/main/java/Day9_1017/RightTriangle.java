package Day9_1017;

public class RightTriangle {

    public static void main(String[] args) {
        RightTriangle rt = new RightTriangle();
        rt.printRightTriangle(4);
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
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
