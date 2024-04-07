package Recursion_Ques;

public class SumofNaturalNo {
    static int sumN(int n) throws Exception{
        if(n<0){
            throw new Exception("Number Can't be NEgative");
        }
        if(n<=0){
            return 0;
        }
        return n+sumN(n+1);

    }
    public static void main(String[] args) {
        try {
            System.out.println(sumN(10));
        } catch (Exception e) {
           System.out.println(e);
        }
    }
}
