public class EvenOdd {
    static void printEvenOdd(int n){
        if(n==0) return;
        if(n%2==0){
            System.out.println("Even Num: "+n);
        }
        printEvenOdd(n-1);
        if(n%2!=0){
            System.out.println("Odd Num: "+n);
        }
    }
    public static void main(String[] args) {
        printEvenOdd(20);
    }
}
