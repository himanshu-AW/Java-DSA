public class SeriseSum {
    // 12+22+32+42+52+.....
    public static void main(String[] args) {
        int n=3;
        long sum=0;
        for(int i =1;i<=n;i++){
            sum+=i*10+2;
        }
        System.out.println(sum);
    }
}
