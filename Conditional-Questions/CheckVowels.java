package Conditional_Ques;

import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // chec vowels & consonents without switch
        System.out.print("Enter a character :");
        String s = sc.next();
        s=s.toLowerCase();
        char ch=s.charAt(0);
        if ( ch =='a' || ch=='i' || ch=='o' || ch=='e' || ch=='u')
        System.out.println("the first character is vowel");
        else 
        System.out.println("the first character is consonent");
        sc.close();
    }
}
