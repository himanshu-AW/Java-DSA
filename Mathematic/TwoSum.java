import java.util.*;

public class TwoSum {
    // static boolean checkPair(int arr[],int x){ // brute force approach.
    //     for(int i=0;i<arr.length-1;i++){
    //         for(int j=i+1;j<arr.length;j++){
    //             if(arr[i]+arr[j]==x){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    static boolean checkPair(int arr[],int x){ // using two pointer approach .
        // first we need to sort the array.
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        while(l!=r ){
            if(arr[l]+arr[r]==x){
                
                return true;
            }
            else if( arr[l]+arr[r]<x){
                l++;
            } else { //arr[l]+arr[r]>x
                r--;
            }
        }
        return false;
    }

    // static boolean checkPair(int arr[],int x){ // using hashing
    //     HashSet<Integer> s = new HashSet<>();
        
    //     for ( int i=0;i<arr.length;i++){
    //         int temp = x - arr[i];
    //         if(s.contains(temp)){
    //             return true;
    //         }else{
    //             s.add(arr[i]);
    //         }
    //     }
    //     return false;
    // }

    public static void main(String[] args) {
        // int arr[]={0,-1,2,-3,1};
        int arr[]={2,7,11,15};
        int x=9;
        if(checkPair(arr, x)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
