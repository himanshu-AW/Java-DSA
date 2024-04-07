public class SumOfDigit {
    static int digitSum(int digit){
        if(digit==0) return 0;
        return  digit%10 + digitSum(digit/10);
    }
    public static void main(String[] args) {
        System.out.println(digitSum(12345));
    }
}
