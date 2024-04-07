package ProbLC;

public class PascalTriangle119 {

    private int factorial(int i) {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }

    public static void main(String[] args) {
        int n = 13; // Number of rows
        PascalTriangle119 pascal = new PascalTriangle119();

        // using nCr
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int temp = pascal.factorial(i) / (pascal.factorial(i - j) * pascal.factorial(j));
                System.out.print(" " + temp);
            }
            System.out.println();
        }
        

        // Using Binomial Coefficient (C(line, i)):
        for (int line = 1; line <= n + 1; line++) {
            for (int j = 0; j <= n - line; j++) {
                System.out.print(" ");
            }
            int C = 1;
            for (int i = 1; i <= line; i++) {
                System.out.print(C + " ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }

    }
}
