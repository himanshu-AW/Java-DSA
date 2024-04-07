package Loops_Ques;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Prime Number: Write a Java program to check if a given number is prime or not using loops and conditional statements. 
        System.out.println("Enter a NUMNER :");
        int n = sc.nextInt();
        boolean flag=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }        
        if(flag) System.out.println(n+" is a Prime Number.");
        else System.out.println(n+" is not a Prime Number .");
        sc.close();
    }
}
