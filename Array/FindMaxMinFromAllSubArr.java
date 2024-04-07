// Find MAximum sum & minimum sum from the all subarray
/**
 * FindMaxMinFromAllSubArr
 */
public class FindMaxMinFromAllSubArr {

    public static void main(String[] args) {
        int arr[]={5,4,6,3,7,2};

        // logic
        int mx=Integer.MIN_VALUE;
        int mn=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int start=i;
            for(int j=i;j<arr.length;j++){
                int end=j;
                int sum=0;
                for(int k=start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum+=arr[k];
                }
                System.out.println("Sum "+sum+" ");
                // System.out.println();
                if(sum>mx){
                    mx=sum;
                }
                if(sum<mn){
                    mn=sum;
                }
            }
            System.out.println();

        }
        System.out.println("Max "+mx);
        System.out.println("Min "+mn);
    }
}