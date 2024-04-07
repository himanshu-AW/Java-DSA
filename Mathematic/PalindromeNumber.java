public class PalindromeNumber {
    void isPalindrome(int n){
        int left=0;
        int right=0;
        int count =countDigits(n);
        int i=0;
        while(true){
            left=n/power(count-1-i);
            right=n%power(i+1);
            i++;
            System.out.println(left);
            System.out.println(right);
            if(left!=right){
                break;
            }
        }
    }
    int power(int n){
        int pw=1;
        while(n>0){
            n--;
            pw*=10;
        }
        return pw;
    }
    int countDigits(int n){
        int c=0;
        while (n>0){
            n=n/10;
            c++;
        }
        return c;
    }
    public static void main(String[] args) {
        PalindromeNumber obj = new PalindromeNumber();

        int n=1221;
        obj.isPalindrome(n);
        
    }
}
