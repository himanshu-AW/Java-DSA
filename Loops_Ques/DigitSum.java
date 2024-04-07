package Loops_Ques;

import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //  Digit Sum.You are given an integer number, say 123 the output will be 1+2+3=6.
        System.out.println("Enter A number :");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n/=10;
        }
        System.out.println("Digit Sum of thr given Number :"+sum);
        sc.close();
    }
}
