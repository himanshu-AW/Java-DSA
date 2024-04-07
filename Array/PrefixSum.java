import java.util.Arrays;

public class PrefixSum {
    static void prefixSumArr(int[] arr ){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,4,5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        prefixSumArr(arr); 
        System.out.println("PrefixSum  Array: "+Arrays.toString(arr)); 
    }
}
