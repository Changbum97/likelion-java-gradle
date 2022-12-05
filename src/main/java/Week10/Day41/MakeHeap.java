package Week10.Day41;

public class MakeHeap {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 5, 7, 3, 2, 4, 6, 9};
        int[] heap = new int[arr.length + 1];
        heap[1] = arr[0];

        for(int i = 1 ; i < arr.length ; i ++) {
            heap[i + 1] = arr[i];

            int j = i + 1;
            while(true) {
                if(j / 2 == 0 || heap[j / 2] >= heap[j]) break;

                int temp = heap[j];
                heap[j] = heap[j / 2];
                heap[j / 2] = temp;
                j /= 2;
            }
        }

        for(int i = 1 ; i <= arr.length ; i ++) {
            System.out.print(heap[i] + " ");
        }
    }
}
