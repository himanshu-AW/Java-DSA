package Patterns_Ques;

public class NumPattern {
    public static void main(String[] args) {
        
        int n=4;
        // ---1
        // --232
        // -34543
        // 4567654
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("-");
            }
            
            for(int j=i;j<= 2*i-1;j++){
                System.out.print(j);
            }
            for(int j=2*i-2;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
            
        }
        int a=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("-");
            }
            
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
                a++;
                
            }
            System.out.println();
            
        }
    }
}
