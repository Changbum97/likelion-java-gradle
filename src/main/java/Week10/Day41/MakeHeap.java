package Week10.Day41;

public class MakeHeap {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 5, 7, 3, 2, 4, 6, 9};
        int[] heap = new int[arr.length ];
        heap[0] = arr[0];

        for(int i = 1 ; i < arr.length ; i ++) {
            heap[i] = arr[i];

            int childIdx = i;
            int parentIdx;

            while(childIdx > 0) {
                if(childIdx % 2 == 0) parentIdx = childIdx / 2 - 1;
                else parentIdx = childIdx / 2;

                if(heap[parentIdx] >= heap[childIdx]) break;

                int temp = heap[parentIdx];
                heap[parentIdx] = heap[childIdx];
                heap[childIdx] = temp;
                childIdx = parentIdx;
            }
        }

        for(int i = 0 ; i < arr.length ; i ++) {
            System.out.print(heap[i] + " ");
        }
    }
}
