import java.util.Arrays;

public class ReverseArr{

    public static void resverseArr(int nums[]){
        int start=0;
        int end = nums.length-1;
        while(start!=end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void reverseArrRec(int[] arr,int start, int end){
        if(start >= end){
            return ;
        }
        int temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            reverseArrRec(arr,start+1,end-1);
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};

        System.out.println("Before Array: " + Arrays.toString(nums));
        
        // using loop
        // resverseArr(nums);
        
        // using recursion
        reverseArrRec(nums,0,nums.length-1);

        System.out.println("After Array: " + Arrays.toString(nums));
        
    }
}