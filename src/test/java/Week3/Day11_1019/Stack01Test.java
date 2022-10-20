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
        stack01.push(30);

        int arr[] = stack01.getArr();
        assertEquals(10, arr[0]);
        assertEquals(20, arr[1]);
        assertEquals(30, arr[2]);
    }

    @Test
    @DisplayName("Stack Push And Pop Test")
    void pushAndPopTest() {
        Stack01 stack01 = new Stack01(100);
        stack01.push(10);
        stack01.push(20);
        assertEquals(20, stack01.pop());

        stack01.push(30);
        assertEquals(30, stack01.pop());
        assertEquals(10, stack01.pop());
    }
}