import java.util.Arrays;

public class FindUnique {
    static int findUniqueNum(int arr[]){
        int n=arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,3,2,1};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Unique Number: "+findUniqueNum(arr)); 
    }
}
