package Recursion_Ques;

import java.util.Scanner;

public class TrianglePattern {
    static void printTriangle(int n) {
        if (n == 0) {
            return;
        }
        printTriangle(n - 1);
        System.out.println();
        printStat(n);
    } 

    static void printStat(int n) {
        if (n == 0) {
            return;
        }
        System.out.print("*");
        printStat(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number :");
        int n = sc.nextInt();
        printTriangle(n);
        sc.close();
    }
}
