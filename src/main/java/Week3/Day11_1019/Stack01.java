package Week3.Day11_1019;

public class Stack01 {

    private int[] arr = new int[10000];
    private int pointer = 0;
    public Stack01() { }

    public Stack01(int size) {
        arr = new int[size];
    }

    public void push(int value) {
        arr[pointer ++] = value;
    }

    public int[] getArr() {
        return arr;
    }
}
