public class ReverseANum {
    static int revNum(int n){
        // int tempN = n;
        int revN = 0;
        while( n != 0){
            revN = revN*10+ n%10;
             n/=10;
        }
        // tempN%10 == 0 ? return Integer.valueOf("0"+Integer.toString(revN)) : return revN;
        return revN;
    } 
    public static void main(String[] args) {
        System.out.println(revNum(1234560));
    }
}
