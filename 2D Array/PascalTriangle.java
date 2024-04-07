import java.util.Arrays;
import java.util.Scanner;

public class PascalTriangle {
    static int[][] pascal(int n){
        int ans[][] = new int[n][]; //jacked array
        for(int i=0;i<n;i++){
            //  creating columns if i->0 then i+1 -> 0+1=1(size of Column)
            ans[i]=new int[i+1];
            // first & last columns = 1 
            ans[i][0]=ans[i][i]=1;
            // for i = 3 then 1 2 1
            // for i = 4 then 1 3 3 1
            for(int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    static void printArr(int[][] arr,int r){
        for(int i=0;i<r;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans[][]=pascal(n);
        printArr(ans, n);

        input.close();
    }
}
