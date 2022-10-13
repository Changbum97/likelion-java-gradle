package Day6_1012;

public class Max {

    public class ValueAndIndex {
        int value, x, y;

        public ValueAndIndex(int value, int x, int y) {
            this.value = value;
            this.x = x;
            this.y = y;
        }
    }
    public ValueAndIndex getMax(int[][] arr) {
        int maxValue = arr[0][0];
        int x = 0, y = 0;
        for(int i = 0 ; i < arr.length; i ++) {
            for(int j = 0 ; j < arr[i].length ; j ++) {
                if(arr[i][j] > maxValue) {
                    maxValue = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        return new ValueAndIndex(maxValue, x + 1, y + 1);
    }

    public static void main(String[] args) {
        int[][] arr = new int[][]{
            {3, 23, 85, 34, 17, 74, 25, 52, 65},
            {10, 7, 39, 42, 88, 52, 14, 72, 63},
            {87, 42, 18, 78, 53, 45, 18, 84, 53},
            {34, 28, 64, 85, 12, 16, 75, 36, 55},
            {21, 77, 45, 35, 28, 75, 90, 76, 1},
            {25, 87, 65, 15, 28, 11, 37, 28, 74},
            {65, 27, 75, 41, 7, 89, 78, 64, 39},
            {47, 47, 70, 45, 23, 65, 3, 41, 44},
            {87, 13, 82, 38, 31, 12, 29, 29, 80}
        };

        Max max = new Max();
        ValueAndIndex result = max.getMax(arr);
        if(result.value == 90) {
            System.out.println("테스트 통과");
        } else {
            System.out.println("테스트 실패");
        }

        System.out.printf("최대값 : %d\n최댓값 인덱스 : (%d, %d)", result.value, result.x, result.y);
    }
}
