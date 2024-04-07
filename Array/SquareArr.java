import java.util.Arrays;

public class SquareArr {

    static int[] sortSquareArr(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        int left = 0, right = n - 1;
        int k = n - 1;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k--] = arr[left] * arr[left];
                left++;
            } else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    
    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5, 6 }; // non-decreasing order
        int[] arr={-10,-8,-3,1,4,7,9}; //non-decreasing order
        System.out.println("Orinal Array: " + Arrays.toString(arr));
        int ans[] = sortSquareArr(arr);
        System.out.println("Squared Array: " + Arrays.toString(ans));
    }
}
