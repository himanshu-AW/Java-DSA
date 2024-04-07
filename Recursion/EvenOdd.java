package Recursion_Ques;

public class EvenOdd {
    static void printEvenOdd(int n){
        if(n==0){
            System.out.println();
            return;
        }
        if(n%2==0) System.out.println("Even no :"+n);
        printEvenOdd(n-1);
        if(n%2!=0) System.out.println("ODD no :"+n);
        
    }
    public static void main(String[] args) {
        printEvenOdd(10);
    }
}
