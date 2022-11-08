package Week6.Day23_1108;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6, 7, 9, 10, 15, 20};

        int idx = binarySearch(0, arr.length, 7, arr);
        System.out.println(idx);
    }

    static int binarySearch(int left, int right, int findNum, int[] arr) {
        int mid = (left + right) / 2;
        if(arr[mid] == findNum) return mid;
        else if(arr[mid] > findNum) {
            return binarySearch(left, mid - 1, findNum, arr);
        } else {
            return binarySearch(mid + 1, right, findNum, arr);
        }
    }
}
