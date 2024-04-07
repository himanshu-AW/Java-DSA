package Loops_Ques;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        // Count digits
        System.out.println("Enter a Number :");
        int n=sc.nextInt();
        int c=0;
        while(n>0){
            n/=10;
            c++;
        }
        System.out.println("Total Count Digits are : "+c);
        sc.close();
        
    }
}
