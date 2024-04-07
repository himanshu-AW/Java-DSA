package Functions_Ques;

import java.util.Scanner;

public class SimpleInterest {
    public static void si(double p ,double r, double t){
        double si =(p*t*r)/100;
        System.out.println("The Simple Interest : "+si);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double pri, rate, time;
        System.out.println(" Enter Principle : ");
        pri =sc.nextDouble();

        System.out.println(" Enter Rate : ");
        rate =sc.nextDouble();

        System.out.println(" Enter Time : ");
        time =sc.nextDouble();
        
        si(pri, rate, time);

        sc.close();
    }
}
