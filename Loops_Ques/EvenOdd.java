package Loops_Ques;

import java.util.Scanner;

class EvenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Even or Odd: Write a Java program that prints all even and odd numbers in the given range
        System.out.println("Enter the Range :");
        int x=sc.nextInt();
        int z=sc.nextInt();
        for (int i = x; i <=z; i++) {
            if(i%2==0) System.out.println("even :"+i);
            else System.out.println("odd:"+z);
        }
        sc.close(); 
    }
}