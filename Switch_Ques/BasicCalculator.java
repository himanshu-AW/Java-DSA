import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menu-Driven Calculator: Create a menu-driven calculator program that allows
        // the user to choose from a list of operations (addition, subtraction,
        // multiplication, division) using a switch statement. Take two numbers as input
        // and perform the selected operation.

        System.out.println("Basic Calculator");
        System.out.println("Enter 1st Number :");
        int a=sc.nextInt();
        System.out.println("Enter 2nd Number :");
        int b=sc.nextInt();
        System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division");
        System.out.println("Select An operation:");
        int op = sc.nextInt();
        switch(op){
            case 1:
                System.out.println("Addition of two number : "+(a+b));
                 break;
             case 2:
                 System.out.println("Subtraction of two number : "+(a-b));
                 break;
             case 3:
                 System.out.println("Multiplication of two number : "+(a*b));
                 break;
             case 4:
                 System.out.println("Division of two number : "+(a/b));
                 break;
             default:
                 System.out.println("You have Choosed Wromg operation !!");
        }

        sc.close();
    }
}
