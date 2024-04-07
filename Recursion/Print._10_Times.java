package Backtrack_Day_07Nov;
class Print_10_Times{
    static void printN_times(int n){
        if(n==0){
            return;
        }
        System.out.println("Hello");
        printN_times(n-1);
    }
    public static void main(String[] args) {
        printN_times(10);
    }
}