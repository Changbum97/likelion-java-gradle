package Week8.Day32_1122;

public class ArraySum {
    public static void main(String[] args) {
        int arr[] = new int[]{7, 3, 2, 9, 10, 2};
        System.out.println(sum(arr, arr.length - 1));
    }
    static int sum(int[] arr, int x) {
        if(x == -1) return 0;
        return arr[x] + sum(arr, x - 1);
    }
}
