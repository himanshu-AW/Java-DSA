package Functions_Ques;

import java.util.Scanner;

public class IsLeapYear {
    public static boolean isLeapYear(int yr){
        if(yr%400==0 || yr%4==0){
           return true;
        } else if(yr%100==0){
            return false;
        } else {
                return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a year :");
        int yr = sc.nextInt();

        if(isLeapYear(yr)){
             System.out.println("leap year");
        }
        else {
            System.out.println("Not leap year");
        }
        sc.close();
    }
}
