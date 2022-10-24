package Week4.Day14_1024;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthNumberPriorityQueue {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        QueueTest();

//        Solution s = new Solution();
//        System.out.println(Arrays.toString(s.solution(array, commands)));
    }

    static void QueueTest() {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int[] arr = {1, 5, 2, 6, 3, 7, 4};
        for(int i = 0 ; i < arr.length ; i ++) {
            pq.add(arr[i]);
        }

        while(!pq.isEmpty()) {
            System.out.print(pq.poll() + " ");
        }
    }

    static class Solution {
        public int[] solution(int[] arr, int[][] commands) {
            int[] answer = new int[commands.length];
            for (int i = 0; i < commands.length; i++) {
                PriorityQueue<Integer> pq = new PriorityQueue<>();
                // 우선순위 큐에 from, to까지 넣기
                for (int j = commands[i][0]-1; j < commands[i][1]; j++) {
                    pq.add(arr[j]);
                }
                // 정렬이 되었기 때문에 뽑기만 한다.
                for (int j = 0; j < commands[i][2]; j++) {
                    answer[i] = pq.poll();
                }
            }
            return answer;
        }

    }
}
