import java.util.Scanner;

public class IsPrime {
    static boolean isPrime(int n){
        for(int i =2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    static void printPrime(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }

    static void printPrime(int s,int e){
        for(int i=s;i<=e;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }


    //1. oops
    //2. solid principles
    //3. function questions at least 5
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Range: ");
        int num = input.nextInt();
        printPrime(num);

        // printPrime(2, 50);

        input.close();
    }
}
