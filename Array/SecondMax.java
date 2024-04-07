import java.util.Arrays;

public class SecondMax {

    static int findMax(int[] arr){ // find first max-value in array
        int n=arr.length;
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
           if(arr[i]>mx){
            mx =arr[i];
           }
        }
        return mx;
    }

    static int findSecondMax(int[] arr){ 
        int mx = findMax(arr);
        int n=arr.length;
        // replace first max-value by -infinity
        for (int i = 0; i < n; i++) {
            if(arr[i] == mx){
             arr[i] =Integer.MIN_VALUE;
            }
        }
        // System.out.println(Arrays.toString(arr));

        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] > secMax){
             secMax =arr[i];
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        int arr[]= {5,11,6,9,11,6,9,11,4};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Second Maximum Number: "+findSecondMax(arr)); 


        int arr2[]= {-5,-1,0,-3,0,-6,-5};
        System.out.println("Original Array: " + Arrays.toString(arr2));
        System.out.println("Second Maximum Number: "+findSecondMax(arr2)); 


    }
}
