import java.util.Scanner;

public class ArmstrongNum {

    static int calLen(int n){
        int count=0;
        while (n>0) {
            count++;
            n/=10;
        }
        return count;
    }

    static boolean isArmstrong(int n){
        int tempNum = n;
        int len = calLen(n);
        int sum =0;
        while (tempNum>0) {
            int rem = tempNum%10;
            sum+=Math.pow(rem, len);
            tempNum/=10;
        }
        if(sum==n){
            return true;
        }
        else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Range: ");
        int num = input.nextInt();
    
        if(isArmstrong(num)){
            System.out.println(num+" Yes, its is Armstrong Number.");
        }else{
            System.out.println(num+" its is not a Armstrong Number.");
        }

        input.close();
    }
}
