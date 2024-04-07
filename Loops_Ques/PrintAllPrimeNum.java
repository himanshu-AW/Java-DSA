package Loops_Ques;

import java.util.Scanner;

public class PrintAllPrimeNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Range :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i <=m; i++) {
            boolean flag=true;
            for (int j = 2; j<Math.sqrt(i); j++) {
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag) System.out.println(i);
        }
        
        sc.close();
    }
}
