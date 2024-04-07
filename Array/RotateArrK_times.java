import java.util.Arrays;

public class RotateArrK_times {
    
    static void swapNum(int[] arr, int i, int j){
        arr[i]=arr[i]+arr[j]; 
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
    static void reverseArr(int[] arr,int i, int j){
        while (i<j) {
            swapNum(arr, i, j);
            i++;
            j--;
        }
    }
    static void rotateArrKth(int arr[] , int k){
        int n=arr.length;
        // make k in cyclic form 
        k%=n; 
        // reverse first half : 0 to n-k-1
        reverseArr(arr, 0, n-k-1);
        // reverse second half : n-k to n-1
        reverseArr(arr, n-k, n-1);
        // reverse whole array : 0 to n-1
        reverseArr(arr, 0, n-1);
    }
    public static void main(String[] args) {
         int nums[] = {1,2,3,4,5,6,7};
        int k = 4; //rotation itreation

        System.out.println("Array before rotation: " + Arrays.toString(nums));
        rotateArrKth(nums, k);
        System.out.println("Array after rotation: " + Arrays.toString(nums));

    }
}
