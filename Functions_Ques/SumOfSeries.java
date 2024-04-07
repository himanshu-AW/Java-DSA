package Functions_Ques;

public class SumOfSeries {
    public static long SumSeries(int n){
        long sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.print(SumSeries(n));
    }
}