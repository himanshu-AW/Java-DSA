package Conditional_Ques;

import java.util.Scanner;

public class Divyrot {
    public static int lent(int n){
        int l=0;   
        while(n>0){
            l++;
            n/=10;
            }
            return l;
        }
    static int rot(int x, int r){
        int l = lent(x);

        while(r>0){
            int s = x% (int) (Math.pow(x, l-1));
            x=x/(int) (Math.pow(x, l-1));
            x=s*10+x;
        }
        System.out.println(x);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println("enter the number of rotation you want to perform");
        int r = sc.nextInt();

        rot(n, r);
        
        sc.close();
    }
}
