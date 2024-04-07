package Loops_Ques;

import java.util.Scanner;

public class RevserseNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Reverse a Number: Write a program to reverse a given number using loops.
        System.out.println("Enter a NUMNER :");
        int n = sc.nextInt();
        int rev=0;
        while(n>0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        System.out.println("Reversed number is "+rev);
        sc.close();
    }
}
