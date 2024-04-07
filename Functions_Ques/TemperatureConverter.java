package Functions_Ques;

import java.util.Scanner;

public class TemperatureConverter {
    public static double celToFah(double c){
        double f=(9*c/5)+32;
        return f;
    }
    public static double fahToCel(double f){
        double fo=5/9;
        double cl=fo*(f-32);
        return cl;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // temp converter
        System.out.println("Choose temperature what you wants to convert : \n1.Celcious to Fahrenheit\n2.Fahrenheit to Celcious");
        int temp=sc.nextInt();
        switch(temp){
            case 1 : System.out.println("Enter Celcious Temperature value : ");
                     double c=sc.nextInt();
                     System.out.println("Fahrenheit temperature : "+celToFah(c));
                     break;
            case 2 : System.out.println("Enter Fahrenheit Temperature value : ");
                     double fr=sc.nextInt();
                     System.out.println("Celcious temperature : "+fahToCel(fr));
                     break;
            default:
            System.out.println("You have Enter wrong option !!");
        }
        sc.close();
    }
}
