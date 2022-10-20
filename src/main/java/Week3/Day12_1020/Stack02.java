package Week3.Day12_1020;

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
        return arr[-- pointer];
    }

    public int[] getArr() {
        return arr;
    }

}
