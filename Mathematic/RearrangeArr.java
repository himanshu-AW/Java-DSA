import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RearrangeArr {

    public static void fixArr(int arr[]){
        int n = arr.length;
        int i,j;

        // place element at correct postion
        for(i = 0 ; i<n ; i++){
            for(j = 0 ; j < n ;j++){
                if(arr[j]==i){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    break;
                }
            }
        }
        
        // if element not present , place -1 it's postion
        for(i =0 ; i< n ; i++){
            if(arr[i]!=i){
                arr[i]=-1;
            }
        }
    }

    public static void fixArray(int arr[]){
        
        for(int i = 0 ; i< arr.length ; i ++ ){
            if(arr[i] != -1 && arr[i] != i){
                int x = arr[i];
                while(arr[x] != -1 && arr[x] != x){
                    int temp =arr[x];
                    arr[x] = x;
                    x = temp ;
                }
                arr[x]=x;
                if(arr[i]!=i){
                    arr[i] = -1;
                }
            }
        }
    }

    public static void fixArr_set(int arr[]){
        Set<Integer> s = new HashSet<Integer>();

        for(int i = 0 ; i < arr.length ; i ++ ){
            s.add(arr[i]);
        }
        for(int i = 0 ; i < arr.length ; i ++ ){
            if(s.contains(i)){
                arr[i]= i;
            }else{
                arr[i]=-1;
            }
        }
    }

    public static void fixArr_swap(int arr[]){
        for(int i =0 ; i < arr.length;){
            if(arr[i] >= 0 && arr[i]!= i ){
                int temp = arr[arr[i]];
                arr[arr[i]] = arr[i];
                arr[i]  = temp;
            }else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int nums [] = {-1,-1,6,1,9,3,2,-1,4,-1};
        // int nums[] = {19,7,0,3,18,15,12,6,1,8,11,10,9,5,13,16,2,14,17,4};

        System.out.println("Before Array: " + Arrays.toString(nums));

        // Nave approach : TC = O(n^2) , AS = O(1)
        // fixArr(nums);

        // Another approach  : TC  = O(n) , AS = O(1)
        // fixArray(nums);

        // using set : TC = O(n^2) , AS = O(n)
        // fixArr_set(nums);

        // using swapimg elements :  TC  = O(n) , AS = O(1)
        fixArr_swap(nums);

        System.out.println("After Array: " + Arrays.toString(nums));
    }
}
