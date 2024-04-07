package Functions_Ques;

import java.util.Scanner;

public class ARmstrongNUmFun {
    public static int len(int n){
        int l=0;
        while(n>0){
            n/=10;
            l++;
        }
        return l;
    }
    public static int power(int n,int l){
        int ans=1;
        while(l>0){
            ans=ans*n;
            l--;
        }
        return ans;
    }
    public static boolean isArmstrong(int n){
        int l=len(n);
        int m=n;
        int res=0;
        while(m>0){
            int rem=m%10;
            res+=power(rem, l);
            m/=10;
        }
        if(res==n){
            return true;
        } else{
            return false;
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n=sc.nextInt();

        if(isArmstrong(n)){
            System.out.println("ArmStrong NUmber");
        } else{
            System.out.println("not");
        }

        sc.close();
    }
}
