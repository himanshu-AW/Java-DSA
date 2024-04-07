import java.util.Arrays;

public class SortEvenOdd {

    static void swapNum(int[] arr, int i, int j){
        arr[i]=arr[i]+arr[j]; 
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }

    static void sortEvenOddArr(int arr[]){
        int n =arr.length;
        int left = 0 ;
        int right = n-1;
        while (left<right) {
            if(arr[left]%2==1 && arr[right]%2==0){
                swapNum(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]%2==0) left++;
            if(arr[right]%2==1) right--;
         }
    }

    public static void main(String[] args) {
        int arr[]= {4,5,34,7,1,9,44,23,37};
        System.out.println("Original Array: " +Arrays.toString(arr));
        sortEvenOddArr(arr);
        System.out.println("Sorted Array: " +Arrays.toString(arr));
    }
}
