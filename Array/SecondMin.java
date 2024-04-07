import java.util.Arrays;

public class SecondMin {

    static int findMin(int[] arr) { // find first min-value in array
        int n = arr.length;
        int mn = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < mn) {
                mn = arr[i];
            }
        }
        return mn;
    }

    static int findSecondMin(int[] arr) {
        int mn = findMin(arr);
        int n = arr.length;
        // replace first min-value by +infinity
        for (int i = 0; i < n; i++) {
            if (arr[i] == mn) {
                arr[i] = Integer.MAX_VALUE;
            }
        }
        // System.out.println(Arrays.toString(arr));

        int secMin = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] < secMin) {
                secMin = arr[i];
            }
        }
        return secMin;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1, 6, 3, 1, 6, 9, 11, 4 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Second Minimum Number: " + findSecondMin(arr));

        int arr2[] = { -5, -1, 0, -3, 0, -6, -5 };
        System.out.println("Original Array: " + Arrays.toString(arr2));
        System.out.println("Second Minimum Number: " + findSecondMin(arr2));

    }
}
