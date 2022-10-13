package Day6_1012;

interface Compare {
    boolean doSomething(int valueA, int valueB);
}

public class MaxAndMin {

    public class ValueAndIndex {
        int value, x, y;

        public ValueAndIndex(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }
    private ValueAndIndex getMaxOrMin(int[][] arr, Compare compare) {  // callback
        int targetValue = arr[0][0];
        int x = 0, y = 0;
        for(int i = 0 ; i < arr.length; i ++) {
            for(int j = 0 ; j < arr[i].length ; j ++) {
                boolean isSth = compare.doSomething(targetValue, arr[i][j]);
                // max인 경우 targetValue < arr[i][j] => true
                // min인 경우 targetValue > arr[i][j] => true
                if(isSth) {
                    targetValue = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        return new ValueAndIndex(targetValue, x + 1, y + 1);
    }

    public ValueAndIndex max(int[][] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA < valueB;
            }
        });
    }

    public ValueAndIndex min(int[][] arr) {
        return getMaxOrMin(arr, new Compare() {
            @Override
            public boolean doSomething(int valueA, int valueB) {
                return valueA > valueB;
            }
        });
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
                {3, 23, 85, 34, 17, 74, 25, 52, 65},
                {10, 7, 39, 42, 88, 52, 14, 72, 63},
                {87, 42, 18, 78, 53, 45, 18, 84, 53},
                {34, 28, 64, 85, 12, 16, 75, 36, 55},
                {21, 77, 45, 35, 28, 75, 90, 76, 16},
                {25, 87, 65, 15, 28, 11, 37, 28, 74},
                {65, 27, 75, 41, 7, 89, 78, 64, 39},
                {47, 47, 70, 45, 23, 65, 3, 41, 44},
                {87, 13, 82, 38, 31, 12, 29, 29, 80}
        };

        MaxAndMin maxAndMin = new MaxAndMin();
        ValueAndIndex resultMax = maxAndMin.max(arr);
        System.out.printf("최대값 : %d\n최댓값 인덱스 : (%d, %d)\n\n", resultMax.value, resultMax.x, resultMax.y);
        ValueAndIndex resultMin = maxAndMin.min(arr);
        System.out.printf("최소값 : %d\n최댓값 인덱스 : (%d, %d)", resultMin.value, resultMin.x, resultMin.y);
    }
}
