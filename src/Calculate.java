public class Calculate {

    public static int[][] findMinOfOddColumn(int[][] array) {
        int size = findLengthOfNewArray(array);
        int[][] mas = new int[size][];
        for (int i = 0, j = 0 ; j < array[0].length; j += 2) {
            if (array[array.length - 1][j] < array[0][j]) {
                mas[i] = fillByOfOnAllCocoColumn(array, j);
                i++;
            }
        }
        return mas;
    }


    private static int findLengthOfNewArray(int[][] array) {
        int count = 0;
        for (int i = 0; i < array[0].length; i += 2) {
            if (array[array.length - 1][i] < array[0][i]) {
                count++;
            }
        }
        return count;
    }

    private static int[] fillByOfOnAllCocoColumn(int[][] colArray, int indexOfColumn) {
        int[] oneColumnArray = new int[colArray.length];
        for (int i = 0; i < colArray.length; i++) {
            oneColumnArray[i] = colArray[i][indexOfColumn];
        }
        return oneColumnArray;
    }
}
