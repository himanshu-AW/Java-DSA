package Functions_Ques;

public class CheckNumPositive_Negative {
    static void checkNum_Pos_Neg(int n){
        if(n==0){
            System.out.println("0 Neither be Positive or Nor Be Negative ");
        }else if(n>0){
            System.out.println(n+" Number is Positive");
        } else{
            System.out.println(n+" Number is Negative");
        }
    }
    public static void main(String[] args) {
        checkNum_Pos_Neg(-1);
        checkNum_Pos_Neg(0);
        checkNum_Pos_Neg(1);
    }
}
