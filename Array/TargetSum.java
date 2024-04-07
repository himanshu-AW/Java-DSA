import java.util.Arrays;

public class TargetSum {

    static int pairSum(int arr[], int target) {
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    static int tripletSum(int arr[], int target) {
        int ans = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int arr1[] = {4,6,5,3,8,2};
        int target = 7;
        System.out.println("Original Array: " + Arrays.toString(arr1));
        System.out.println("Target Sum: " + target);
        // [4,3] ,[5,2] => 2
        System.out.println(pairSum(arr1, target));


        int arr2[] = { 1, 4, 5, 6, 3 };
        target = 12;
        System.out.println("Original Array: " + Arrays.toString(arr2));
        System.out.println("Target Sum: " + target);
        // [1,5,6] ,[4,5,3] => 2
        System.out.println(tripletSum(arr2, target));

    }
}