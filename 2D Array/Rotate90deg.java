import java.util.Arrays;

public class Rotate90deg{
    static void transpose(int[][] arr ,int r, int c){
        for(int i=0;i<c;i++){
            for(int j=i;j<r;j++){
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void rotate(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i!=j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    static void rotate90Deg(int[][] arr,int n){
        // first transpose of array
        transpose(arr, n, n);
        // rotate each row
        for(int i=0;i<n;i++){
            rotate(arr[i]);
        }
    }
    static void printArr(int[][] arr,int r){
        for(int i=0;i<r;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void main(String[] args) {
        int arr[][]={ {1,2,3},{4,5,6},{7,8,9} };
        int r=arr.length;
        System.out.println("Before Array:");
        printArr(arr, r);
        rotate90Deg(arr, r);
        System.out.println("After rotation of 90deg Array:");
        printArr(arr, r);
    }
}