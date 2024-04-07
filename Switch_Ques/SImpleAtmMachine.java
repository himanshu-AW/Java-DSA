import java.util.Scanner;

public class SImpleAtmMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Simple ATM Machine: Implement a simple ATM machine program using a switch
        // statement. Allow users to check their balance, deposit money, and withdraw
        // money. Keep track of the user's account balance.

        System.out.println("\tWelcome TO ATM Machine");
        double bal = 20000;
        System.out.println("\n\tSelect Any Option :-\n");
        System.out.println("\t1.Check balance \n\t2.Deposit money \n\t3.Withdrawmoney");
        int o = sc.nextInt();
        // to cleare screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
        switch (o) {
            case 1:
                System.out.println("Your Total Balance is " + bal);
                System.out.println("Thank You ");
                break;
            case 2:
                System.out.print("Enter Deposit Amount : ");
                int d = sc.nextInt();
                bal += d;
                System.out.println("Your Amount Deposit Successfully ");
                System.out.println("Your Total Balance is " + bal);
                System.out.println("Thank You ");
                break;
            case 3:
                System.out.print("Enter Withdraw Amount : ");
                int w = sc.nextInt();
                if (bal < w) {
                    System.out.println("Your Balance is too Low !!");
                } else {
                    bal -= w;
                    System.out.println("Your Amount Withdraw Successfully ");
                    System.out.println("Your Total Balance is " + bal);
                    System.out.println("Thank You ");
                }
                break;
            default:
                System.out.println("Invalid opeartion !!");
        }

        sc.close();
    }
}
