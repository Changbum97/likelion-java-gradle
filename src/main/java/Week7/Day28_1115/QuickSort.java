package Week7.Day28_1115;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50};
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i ++) {
            list.add(arr[i]);
        }
        list = sort(list);
        System.out.println(list);
    }

    static List<Integer> sort(List<Integer> list) {
        if(list.size() <= 1) return list;

        int mid = list.size() / 2;
        int pivot = list.get(mid);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i = 0 ; i < list.size() ; i ++) {
            if(i == mid) continue;;

            if(list.get(i) < pivot) {
                left.add(list.get(i));
            } else {
                right.add(list.get(i));
            }
        }

        List<Integer> answer = sort(left);
        answer.add(pivot);
        answer.addAll(sort(right));

        return answer;
    }
}
