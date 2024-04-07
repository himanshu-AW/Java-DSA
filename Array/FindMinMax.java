import java.util.Arrays;

public class FindMinMax {

    static int[] smallestLargest(int[] arr){
        Arrays.sort(arr);
        int ans[]= {arr[0],arr[arr.length-1]};
        return ans;
    }
    
    static int[] kthSmallestLargest(int[] arr ,int k){
        Arrays.sort(arr);
        int ans[]= {arr[0+k-1],arr[arr.length-k]};
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={3,2,10,4,8,6,1,5};
        System.out.println("Original Array: "+Arrays.toString(arr));

        System.out.println("Find Smallest & Largest in array.");
        int ans[] = smallestLargest(arr);
        System.out.println("smallest element: " + ans[0]);
        System.out.println("largest element: " + ans[1]);

        int k=2;
        System.out.println("Find Kth Smallest & Kth Largest in array.");
        int ans1[] = kthSmallestLargest(arr,k);
        System.out.println(k+" Smallest element: " + ans1[0]);
        System.out.println(k+" Largest element: " + ans1[1]);
    }
}
