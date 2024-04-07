package Conditional_Ques;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        // temp converter
        System.out.println("Choose temperature what you wants to convert : \n1.Celcious to Fahrenheit\n2.Fahrenheit to Celcious");
        int temp=sc.nextInt();
        switch(temp){
            case 1 : System.out.println("Enter Celcious Temperature value : ");
                     float c=sc.nextInt();
                     float f=(9*c/5)+32;
                     System.out.println("Fahrenheit temperature : "+f);
                     break;
            case 2 : System.out.println("Enter Fahrenheit Temperature value : ");
                     float fr=sc.nextInt();
                     float fo=(float)5/9;
                     float cl=fo*(fr-32);
                     System.out.println("Celcious temperature : "+cl);
                     break;
            default:
            System.out.println("You have Enter wrong option !!");
        }
        sc.close();
    }
}
