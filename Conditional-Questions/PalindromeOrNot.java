package Conditional_Ques;

import java.util.Scanner;

public class PalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Palindrome  num / string.
        System.out.println("Enter a number / string : ");
        String st =sc.next();
        int i=0 ,j=st.length()-1;
        while(i<=j){
            if(st.charAt(i)==st.charAt(j)){
                i++;
                j--;
            }
            else break;
        }
        if(i>j) System.out.println("Palindrome");
        else System.out.println("not palindrome");
        sc.close();
    }
}
