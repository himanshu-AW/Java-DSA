package Loops_Ques;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        // Anagram Checker: Write a program that checks whether two given strings are anagrams of each other (i.e., they have the same characters in a different order).
        System.out.println("Enter First String :");
        String str1 = sc.nextLine();
        System.out.println("Enter Second String :");
        String str2 = sc.nextLine();
        // convert both string into lowerCase
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        // check both strings length are equal or not
        if(str1.length()==str2.length()){
            // create 2 char array same length of strings
            char[] chStr1 =new char[str1.length()];
            char[] chStr2 =new char[str2.length()];
            
            // store First String's character into charArray 
            for (int i = 0; i < chStr1.length; i++) {
                chStr1[i]=str1.charAt(i);
            }
            // store Second String's character into charArray 
            for (int i = 0; i < chStr2.length; i++) {
                chStr2[i]=str2.charAt(i);
            }
            // sort first charArray
            Arrays.sort(chStr1);
            // sort second charArray
            Arrays.sort(chStr2);

            boolean result = Arrays.equals(chStr1,chStr2);
            if(result){
                System.out.println(str1+" & "+str2+" are Anagram String .");
            }
            else{
                System.out.println(str1+" & "+str2+" are not Anagram String .");
            }
        }
        else{
            System.out.println(str1+" & "+str2+" are not Anagram String .");
        }

        sc.close();
    }
}
