package Patterns_Ques;

import java.util.Scanner;

public class HolloTriangle {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter a number :");
    int n= sc.nextInt();
    // Enter a number :4
    // *
    // **
    // * *
    // ****
    // for(int i=1;i<=n;i++)
    // {
    //     for(int j=1;j<=i;j++){
    //         if(i==1 ||j==1 || i==j || i==n){
    //             System.out.print("*");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }
    //        }
    //     System.out.println();
    // }
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++){
            if(i==1 ||j==1 || i==j || i==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
           }
        System.out.println();
    }
    sc.close();
    }
}
