package Conditional_Ques;

import java.util.Scanner;

class LeapYr{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // leap year
        System.out.println("Enter a year :");
        int yr=sc.nextInt();
        if(yr%400==0 || yr%4==0){
            System.out.println("leap year");
        } else if(yr%100==0){
            System.out.println("Not leap year");
        } else {
                System.out.println("Not leap year");
        }

        sc.close();
    }
}