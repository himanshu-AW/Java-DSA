package String;

public class PlaindromicSubStr {

    static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static int palindromicSubString(String s){
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                if(isPalindrome(s.substring(i,j))){
                    // System.out.println("yes: "+s.substring(i, j));
                    count++;
                }
                
            }   
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "abbd";
        System.out.println("No. of Sub Palindromic String are "+palindromicSubString(s));
    }
}
