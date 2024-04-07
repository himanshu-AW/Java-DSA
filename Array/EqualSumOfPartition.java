import java.util.Arrays;
import java.util.Scanner;

public class EqualSumOfPartition {

    static int findTotalSum(int arr[]){
        int sum=0;
        for(int x:arr) 
            sum+=x;
        return sum;
    }
    
    static boolean equalSumPartition(int[] arr) {
        int n = arr.length;
        int totalSum = findTotalSum(arr);
        int prefixSum = 0;
        int sufixSum = 0;
        for (int i = 0; i < n; i++) {
            prefixSum +=arr[i];
            sufixSum = totalSum - prefixSum;
            if(prefixSum == sufixSum ){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));

        if(equalSumPartition(arr)){
            System.out.println("Yes, equal sum of partition exists.");
        } else{
            System.out.println("Equal sum of partition not exists.");
        }

        input.close();

    }
}
