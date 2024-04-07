package Recursion_Ques;

public class Print1to10_10to1 {
    static void printNum(int n){
        if(n==0){
            return;
        }
        System.out.println(10-n+1);
        printNum(n-1);
        System.out.println(10-n+1);
    }
    public static void main(String[] args) {
        printNum(10);
    }
}
