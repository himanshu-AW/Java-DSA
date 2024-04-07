package Recursion_Ques;

import java.util.Scanner;

public class PrintCounting {
    static void printNumInc(int n){
        if(n==0) {
            System.out.println(n);
            return ;
        }
        
        printNumInc(n-1);
        System.out.println(n);
    }
    static void printNumDec(int n){
        if(n==0){
            System.out.println(n);
            return ;
        } 
        System.out.println(n);
        printNumDec(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a NUmber :");
        int n =sc.nextInt();
        System.out.println("Accending Order ");
        printNumInc(n);
        System.out.println("Decending Order ");
        printNumDec(n);
        sc.close();
    }
}
