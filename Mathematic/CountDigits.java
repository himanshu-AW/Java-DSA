
public class CountDigits {
    void countDigits(int n){
        int c=0;
        while (n>0){
            n=n/10;
            c++;
        }
        System.out.println(c);
    }
    public static void main(String[] args) {
        int n=54321;
        CountDigits obj = new CountDigits();
        obj.countDigits(n);
    }
}
