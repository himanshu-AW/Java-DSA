package Loops_Ques;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Fibonacci Series: Write a program to generate the Fibonacci series up to a specified number of terms using a loop (e.g., 0, 1, 1, 2, 3, 5, 8, ...).
        System.out.println("Enter a NUMNER :");
        int n = sc.nextInt();
        int a=0,b=1;
        if(n==1)System.out.print(a);
        if(n==2)System.out.print(b);
        else{ 
            System.out.print(a+" ");
            System.out.print(b+" ");
            for(int i=3;i<=n;i++){
                int c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
            }
        }
        sc.close();
    }
}
