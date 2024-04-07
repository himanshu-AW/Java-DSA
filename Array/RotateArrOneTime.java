import java.util.Arrays;

public class RotateArrOneTime {

    public static void rotate(int arr[]){
            int last = arr[arr.length-1];
            for(int i = arr.length-1;i>=1;i--){
                arr[i] = arr[i-1];
            }
            arr[0]=last;
    }

    public static void rotateArr(int arr[]){
            int s=0;
            int e=arr.length-1;
            while(s!=e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
            }
    }

    public static void rotateArray(int arr[],int k){
        int i,j;
        int n=arr.length;

        // reverse the 1st n-1 elements
        for( i = 0, j = n - k - 1 ; i < j ; i++, j-- ){
            int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
            // revsers the entire array
        for(i =0 , j = n - 1 ; i < j ; i++ , j--){
            int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
        }
    } 

    public static void main(String[] args) { //rotate array one time.
        int nums[] = {1,2,3,4,5};
        int k = 1; //rotation itreation

        System.out.println("Before Array: " + Arrays.toString(nums));

        // simple brute-force approach
        // rotate(nums);

        // two pointer approach
        // rotateArr(nums);

        // reversal algorithm
        rotateArray(nums,k);

        System.out.println("After Array: " + Arrays.toString(nums));

    }
}
