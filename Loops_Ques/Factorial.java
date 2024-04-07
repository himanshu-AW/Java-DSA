package Loops_Ques;

import java.util.Scanner;

public class Factorial {
     public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Factorial: Write a program to calculate the factorial of a given number using a loop (e.g., 5! = 5 x 4 x 3 x 2 x 1).
        System.out.println("Enter a NUMNER :");
        int n = sc.nextInt();
        int f=1;
        for(int i=n;i>=1;i--){
            f*=i;
        }
        System.out.println("Factorial of "+n+" : "+f);
        sc.close();
    }
}
