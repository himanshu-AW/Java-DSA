package Functions_Ques;

import java.util.Scanner;

public class RotateDigits {
    public static int len(int n) {
        int l = 0;
        while (n > 0) {
            l++;
            n /= 10;
        }
        return l;
    }

    public static void rotate(int n, int r) {
        int l = len(n); // length of number  i.e; l=5
        r = r % l;  // if number is multiple of itself then convert it into samllest numner which is completely divided the original number
        if (r < 0) { // if num is negative then conert it into positive
            r = r+ l;
        }
        int power=(int)(Math.pow(10,r));  // cal the power of how much digit are rotated (if r=2 then power=10^2=100)
        int leftPart = n / power;  // cal leftPart of Number i.e; lP = 12345/100 =123
        int rightpart=n%power ;  // cal rightPart of Number i.e; rP = 12345%100 =43
        int remPower = l-r;  // cal remaintingPower digit = length(Number) - Rotations i.e; 5-2=3
        power=(int) (Math.pow(10,remPower)); // Cal Power = 10^remainingPower i.e; power = 10^3 =1000
        int result = rightpart*power+leftPart;  // cal rotatedNumber = 43*1000 + 123 = 34123
        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number :");
        // int n = sc.nextInt();
        // System.out.println("Enter Rotation no :");
        // int r = sc.nextInt();
        // rotate(n, r);
        
        rotate(12345, 2);

        sc.close();
    }
}
