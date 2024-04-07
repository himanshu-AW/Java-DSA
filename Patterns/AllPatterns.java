package Patterns;

public class AllPatterns {
    static void holloRectangle(int r, int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == r || j == c) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void invertedRotatedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(j>i){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
    static void invertedHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    static void floydTriangle(int n){
        int c=1;
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
    static void zeroOneTriangle(int n){
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
    static void butterfly(int r){
        for (int i = 1; i <=r; i++) {
            for (int j = 1; j <= r; j++) {
                if(j<=i){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j = r; j >=1;j--) {
                if(j<=i){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (int i = r; i >=1; i--) {
            for (int j = 1; j <= r; j++) {
                if(j<=i){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            for (int j = r; j >=1;j--) {
                if(j<=i){
                    System.out.print(" *");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    static void solidRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                System.out.print(" *");
            }

            System.out.println();
        }
    }
    static void holloRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n;j++){
                if (i == 1 || j == 1 || i ==  n|| j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
    static void dimaond(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
    static void numberPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    static void palindromic(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=i;j>1;j--){
                System.out.print(j+" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int r = 5;
        int c = 7;

        System.out.println("Hollo Rectangle");
        holloRectangle(r, c);

        System.out.println("Inverted & rotated Half-Pyramid");
        invertedRotatedHalfPyramid(r);

        System.out.println("Inverted Half-Pyramid");
        invertedHalfPyramid(r);

        System.out.println("Floyed's Triangle");
        floydTriangle(r);

        System.out.println("0-1 Triangle");
        zeroOneTriangle(r);

        System.out.println("Butterfly Pattern");
        butterfly(r);

        System.out.println("Solid Rhombus");
        solidRhombus(r);

        System.out.println("Hollo Rhombus");
        holloRhombus(r);

        System.out.println("Diamond Pattern");
        dimaond(r);

        System.out.println("Number Pyramid");
        numberPyramid(r);

        System.out.println("Palindromic Pattern");
        palindromic(r);


    }

}
