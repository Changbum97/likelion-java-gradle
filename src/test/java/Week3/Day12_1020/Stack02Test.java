package Week3.Day12_1020;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    @BeforeEach
    void beforeEach() {
        System.out.println("\nUnit Test 시작");
    }

    @Test
    @DisplayName("Stack Push Test")
    void pushTest() {
        Stack02 stack02 = new Stack02(10);
        stack02.push(10);
        stack02.push(20);
        stack02.push(30);

        int arr[] = stack02.getArr();
        assertEquals(10, arr[0]);
        assertEquals(20, arr[1]);
        assertEquals(30, arr[2]);

        System.out.println("Push Test 통과");
    }

    @Test
    @DisplayName("Stack Push and Pop Test")
    void pushAndPopTest() {
        Stack02 stack02 = new Stack02(10);
        stack02.push(10);
        stack02.push(20);
        assertEquals(20, stack02.pop());

        stack02.push(30);
        assertEquals(30, stack02.pop());
        assertEquals(10, stack02.pop());

        System.out.println("Push and Pop Test 통과");
    }

    @Test
    @DisplayName("Stack isEmpty Test")
    void isEmptyTest() {
        Stack02 stack02 = new Stack02(10);
        assertEquals(true, stack02.isEmpty());

        stack02.push(10);
        assertEquals(false, stack02.isEmpty());

        System.out.println("isEmpty Test 통과");
    }

    @Test
    @DisplayName("Stack Peek Test")
    void peekTest() {
        Stack02 stack02 = new Stack02(10);
        stack02.push(15);

        assertEquals(15, stack02.peek());
        assertEquals(15, stack02.peek());

        System.out.println("Peek Test 통과");
    }

    @Test
    @DisplayName("Exception Test")
    void exceptionTest() {
        Stack02 stack02 = new Stack02(10);

        // 모던 자바 표현(lambda)을 사용해서 exception test 진행
        assertThrows(EmptyStackException.class, () -> {
            stack02.pop();
        });

        System.out.println("Exception Test 통과");
    }
}