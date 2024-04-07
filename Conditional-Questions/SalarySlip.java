package Conditional_Ques;

import java.util.Scanner;

public class SalarySlip {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        //  print salary slip
        System.out.print("Enter Name :");
        String name = sc.nextLine();
        System.out.print("Enter basic Salary :");
        double bSal = sc.nextInt();
        double hra = bSal*30/100;
        double da = bSal*20/100;
        double ta= 2000;
        double gross = bSal+hra+da+ta;
        double tax=0;
        if(gross<10000){
            tax=0;
        }
        else if(gross>=10000 && gross<20000){
            tax=gross*10/100;
        }
        else if(gross>=20000 && gross<30000){
            tax=gross*20/100;
        }
        else if(gross>=30000){
            tax=gross*25/100;
        } 
        double netSal=gross-tax;

        System.out.println("Employee name :"+name);
        System.out.println("Gross Salary :"+gross);
        System.out.println("Tax :"+tax);
        System.out.println("Net salary :"+netSal);
        sc.close();
    }
}
