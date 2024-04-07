package Functions_Ques;
import java.util.Scanner;
public class EmployeeDetail {
    
    static String name;
    static double bSal;
    static double ta= 2000;
    
    public static void getData(){
        Scanner sc = new Scanner(System.in);
        //  print salary slip
        System.out.print("Enter Name :");
        name = sc.nextLine();
        
        System.out.print("Enter basic Salary :");
        bSal = sc.nextInt();
    
        sc.close();
    }
    public static double  hra(){
        double hra = bSal*30/100;
        return hra;
    }
    public static double da(){
        double da = bSal*20/100;
        return da;
    }
    public static double gross(){
        double hra = hra();
        double da =da();
        double gross = bSal+hra+da+ta;
        return gross;
    }
    public static double tax(){
        double gross = gross();
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
        return tax;
    }
    public static double netSal(){
        double gross =gross();
        double tax = tax();
        double netSal=gross-tax;
        return netSal;
    }
    public static void showData(){
        double gross = gross();
        double tax = tax();
        double netSal =netSal();
        System.out.println("Employee name :"+name);
        System.out.println("Gross Salary :"+gross);
        System.out.println("Tax :"+tax);
        System.out.println("Net salary :"+netSal);
    }

    public static void main(String[] args) {
        getData();
        showData();
    }
}
