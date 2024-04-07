package Recursion_Ques;

public class PrintDigits {
    static void printDigits(int n){
        if(n==0){
            return;
        }
        System.out.println(n%10);
        printDigits(n/10);
    }
    public static void main(String[] args) {
        printDigits(1023);
    }
}
