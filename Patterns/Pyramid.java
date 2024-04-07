package Patterns_Ques;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
    System.out.print("Enter a number :");
    int n= sc.nextInt();
    for(int i=1;i<=n;i++)
        {
            for(int j=n-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int j=(2*i-1);j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    // for(int i=n;i>=1;i--)
    //     {
    //         for(int j=n-i;j>=1;j--){
    //             System.out.print(" ");
    //         }
    //         for(int j=(2*i-1);j>=1;j--){
    //             System.out.print("*");
    //         }
    //         System.out.println();
    //     }
    sc.close();
    }
}
