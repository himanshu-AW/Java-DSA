package Recursion_Ques;

import java.util.Scanner;

public class PrintPrimeInRange {
    static boolean isPrime(int n,int i){
        if(n<=2){
            return (n==2) ? false : true;
        }
        if(n%i==0){
            return false;
        }
        if(i>n/2) return true;
        return isPrime(n,i+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number :");
        int n = sc.nextInt();
        // int n=23;
        if(isPrime(n,2)){
            System.out.println(n+" Prime Number ");
        } else{
            System.out.println(n+" Not a  Prime number");
        }
         sc.close();
    }
}
