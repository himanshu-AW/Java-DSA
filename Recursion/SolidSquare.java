package Recursion_Ques;

import java.util.Scanner;

public class SolidSquare {
    static void printStat(int c){
        if(c==0){
            return;
        }
        System.out.print("* ");
        printStat(c-1);
    }
    static void printSquare(int r, int c){
        if(r==0){
            return ;
        }
        printStat(c);
        System.out.println();
        printSquare(r-1, c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number :");
        int n = sc.nextInt();
        // printSquare(n, n);
        printStat(n);
         sc.close();
    }
}
