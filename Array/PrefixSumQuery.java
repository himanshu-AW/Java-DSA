import java.util.Arrays;
import java.util.Scanner;

public class PrefixSumQuery {

    static void prefixSum(int[] arr ){
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n+1];

        System.out.println("Enter array elements: ");
        for(int i=1;i<=n;i++){
            arr[i]=input.nextInt();
        }

        System.out.println("Original Array: " + Arrays.toString(arr));
        prefixSum(arr);
        System.out.println("PrefixSum Array: "+Arrays.toString(arr)); 

        System.out.println("Enter quries number: ");
        int q = input.nextInt();

        while (q-- > 0) {
            System.out.println("Enter Query range: ");
            int l = input.nextInt();
            int r =  input.nextInt();
            int sum = arr[r]-arr[l-1];
            System.out.println("Sume is "+sum);
        }

        input.close();
    }

}
