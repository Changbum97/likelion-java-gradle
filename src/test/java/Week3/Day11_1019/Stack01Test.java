package Week3.Day11_1019;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {

    @Test
    @DisplayName("Stack Push Test")
    void pushTest() {
        Stack01 stack01 = new Stack01(100);
        stack01.push(10);
        stack01.push(20);

        int[] arr = stack01.getArr();
        Assertions.assertEquals(10, arr[0]);
        Assertions.assertEquals(20, arr[1]);
    }

}