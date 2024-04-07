public class Print1to10 {
    static void printNum(int n){
        if(n==0) return;
        System.out.print(n+" ");
        printNum(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        printNum(10);
    }
}
