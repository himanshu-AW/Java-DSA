package Conditional_Ques;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Garding System
        System.out.println("Enter Five subjects marks ");
        int maths=sc.nextInt();
        int physics=sc.nextInt();
        int informationTechnology=sc.nextInt();
        int chemistry=sc.nextInt();
        int Physical=sc.nextInt();
        int res = (maths+physics+informationTechnology+chemistry+Physical)/5;
        if(res>=70 && res <80){
            System.out.println("Grade : C");
        } else if(res>=80 && res <90){
            System.out.println("Grade : B");
        } else if(res>=90&& res <=95){
            System.out.println("Grade : A");
        } else if(res>95){
            System.out.println("Grade : A+");
        } else System.out.println("Grade : D");
        sc.close();
    }
}
