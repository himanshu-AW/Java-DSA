import java.util.Arrays;

public class first_lastOccurance {
    static int firstOcc(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        return -1;
    }

    static int LastOcc(int arr[]) {
        int n = arr.length;
        for (int i = n-1; i >=0; i--) {
            for (int j = i-1; j>=0; j--) {
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 1,11, 6, 9, 6,11, 4 };

        System.out.println("Ques:- Find the First occurance of a number which is repeated more than one times ?");
        System.out.println("Original Array: " + Arrays.toString(arr));

        int idx = firstOcc(arr);
        System.out.println("First Occurance of "+arr[idx] +" at index "+idx);
        
        System.out.println("Ques:- Find the Last occurance of a number which is repeated more than one times ?");
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        idx = LastOcc(arr);
        System.out.println("Last Occurance of "+arr[idx] +" at index "+idx);
    }
}
