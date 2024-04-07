package Functions_Ques;

import java.util.Scanner;

public class RectangleAreaPara {
    public static void area( double l , double b){
         System.out.println("The Area Of Rectangle : "+(l*b));
    }
    public static void para( double l , double b){
         System.out.println("The Parameter Of Rectangle : "+2*(l+b));
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double length, breadth;

        System.out.println(" Enter Length : ");
        length =sc.nextDouble();

        System.out.println(" Enter Breadth : ");
        breadth =sc.nextDouble();

        area(length, breadth);
        para(length, breadth);

        sc.close();
    }
}
