package Week8.Day33_1123;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci_for {
    public static void main(String[] args) {
        int n = 15;

        List<Integer> fibonacciNums = new ArrayList<>();
        fibonacciNums.add(1);
        fibonacciNums.add(1);
        for(int i = 2 ; i < n ; i ++) {
            fibonacciNums.add(fibonacciNums.get(i - 1) + fibonacciNums.get(i - 2));
        }
        System.out.println(fibonacciNums);
    }
}
