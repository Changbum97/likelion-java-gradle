package Week3.Day12_1020;

import java.util.EmptyStackException;

public class Stack02 {

    private int[] arr = new int[10000];
    private int pointer = 0;
    public Stack02() { }

    public Stack02(int size) {
        arr = new int[size];
    }

    public void push(int value) {
        arr[pointer ++] = value;
    }

    public int pop() {
        if(this.isEmpty() == true) {
            System.out.println("스택이 비어있어서 pop 할 수 없습니다.");
            throw new EmptyStackException();
        }
        return arr[-- pointer];
    }

    public int peek() {
        if(this.isEmpty() == true) {
            System.out.println("스택이 비어있어서 peek 할 수 없습니다.");
            throw new EmptyStackException();
        }
        return arr[pointer - 1];
    }

    public boolean isEmpty() {
        if(pointer == 0) return true;
        return false;
    }
    public int[] getArr() {
        return arr;
    }


}
