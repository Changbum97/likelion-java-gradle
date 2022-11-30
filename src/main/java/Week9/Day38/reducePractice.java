package Week9.Day38;

import java.util.Arrays;

public class reducePractice {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};

        int sum = Arrays.stream(list)
                .reduce(0, (a, b) -> a + b); // 재귀와 유사
        System.out.println("Sum : " + sum);
    }
}
