package Week3.Day12_1020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    @BeforeEach
    void beforeEach() {
        System.out.println("before Each");
    }

    @Test
    @DisplayName("Stack Push Test")
    void pushTest() {
        Stack02 stack02 = new Stack02(100);
        stack02.push(10);
        stack02.push(20);
        stack02.push(30);

        int arr[] = stack02.getArr();
        assertEquals(10, arr[0]);
        assertEquals(20, arr[1]);
        assertEquals(30, arr[2]);
    }

    @Test
    @DisplayName("Stack Push And Pop Test")
    void pushAndPopTest() {
        Stack02 stack02 = new Stack02(100);
        stack02.push(10);
        stack02.push(20);
        assertEquals(20, stack02.pop());

        stack02.push(30);
        assertEquals(30, stack02.pop());
        assertEquals(10, stack02.pop());
    }
}