public class ReverseOfEachRow {

    static void swap(int[][] arr, int i, int j, int r) {
        arr[r][i] = arr[r][i] + arr[r][j];
        arr[r][j] = arr[r][i] - arr[r][j];
        arr[r][i] = arr[r][i] - arr[r][j];
    }

    static void reverseArr(int[][] arr, int r) {
        int i = 0, j = arr.length - 1;
        while (i != j) {
            swap(arr, i, j, r);
            i++;
            j--;
        }
    }

    static void reverseEachRow(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            reverseArr(arr, r);
        }
    }

    static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[][] arr = new int[5][];
        int[][] arr = { { 11, 22, 33, 44 }, // 0
                { 55, 66, 77, 88 }, // 1
                { 99, 61, 72, 83 } // 2
        };
        System.out.println("Original Array: ");
        printArr(arr);
        reverseEachRow(arr);
        System.out.println("After rotation each row in array: ");
        printArr(arr);

    }
}
