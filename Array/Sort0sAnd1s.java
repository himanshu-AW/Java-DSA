import java.util.Arrays;
public class Sort0sAnd1s{
    static void swapNum(int[] arr, int i, int j){
        arr[i]=arr[i]+arr[j]; 
        arr[j]=arr[i]-arr[j];
        arr[i]=arr[i]-arr[j];
    }
    static void sortZerosOnce(int arr[]){
        int n =arr.length;
        int left = 0 ;
        int right = n-1;
        while (left<right) {
            if(arr[left]==1 && arr[right]==0){
                swapNum(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0) left++;
            if(arr[right]==1) right--;
         }
    }
    public static void main(String[] args) {
        
        int arr[]= {0,1,1,0,0,0,0,1};
        System.out.println("Original Array: " +Arrays.toString(arr));
        sortZerosOnce(arr);
        System.out.println("Sorted Array: " +Arrays.toString(arr));
    }
}