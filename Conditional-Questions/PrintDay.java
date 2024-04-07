package Conditional_Ques;

import java.util.Scanner;

public class PrintDay {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // Print Days (1,2,3) without switch
        System.out.println("Enter day no :");
        int day=sc.nextInt();
        day%=7;
        if(day==1){
            System.out.println("MOnday");
        } else if( day==2){
            System.out.println("Tuesday");
        } else if(day==3){
            System.out.println("Wednesday");
        } else if(day == 4){
            System.out.println("Thusday");
        } else if(day == 5){
            System.out.println("Friday");
        } else if(day == 6){
            System.out.println("Saturday");
        } else if(day == 7){
            System.out.println("Sunday");
        }
        sc.close();
    }
}
