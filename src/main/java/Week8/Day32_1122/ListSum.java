package Week8.Day32_1122;

import java.util.ArrayList;
import java.util.List;

public class ListSum {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(7);
        nums.add(3);
        nums.add(2);
        nums.add(9);
        System.out.println(sum(nums));
    }
    static int sum(List<Integer> nums) {
        int size = nums.size();
        if(size == 0) return 0;

        int lastNum = nums.remove(size - 1);
        return lastNum + sum(nums);
    }
}
