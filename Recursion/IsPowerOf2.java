package Recursion;

public class IsPowerOf2 {
    
    static boolean isPow2(int n){
        if(n == 0) return false;
        if(n==1) return true;
        if(n%2!=0) return false;
        return isPow2(n/2);
    }
    public static void main(String[] args) {
        if(isPow2(34)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
