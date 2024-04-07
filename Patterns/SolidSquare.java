package Patterns_Ques;

import java.util.Scanner;

class SolidSquare{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}