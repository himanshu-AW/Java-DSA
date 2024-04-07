package Functions_Ques;

import java.util.Scanner;

public class SwapWithoutThirdVAr {
    static int a;
    static int b;
    static void swap(){
        a=a^b;
        b=a^b;
        a=a^b;
     }
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);

        System.out.print(" Enter A : ");
        a =sc.nextInt();

        System.out.print(" Enter B : ");
        b =sc.nextInt();
        swap();
        System.out.println("A : "+a);
        System.out.println("B : "+b);

        sc.close();
    }
}
