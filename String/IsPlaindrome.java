package String;


public class IsPlaindrome {
            public boolean isPalindrome(String s) {
                // StringBuilder str = new StringBuilder();
                // int n = s.length();
                // for(int i=0;i<n;i++){
                //     char ch = s.charAt(i);
                //     if(ch>='A' && ch<='Z'){
                //         ch+=32;
                //     }
                //     if(!(ch>='a' && ch<='z' || ch>='0' && ch<='9')){
                //         continue;
                //     }else{
                //         str.append(ch);
                //     }
                // }
                // return str.toString().equals(str.reverse().toString());
        
                if(s == null || s.length() ==0)
                return false;
                
                int left = 0, right = s.length()-1;
                    char ch1;
                    char ch2;
                while(left < right){
                     ch1 = s.charAt(left);
                     ch2 = s.charAt(right);
        
                     ch1 = toLower(ch1);
                     ch2 = toLower(ch2);
        
                    if((ch1 < 'a' || ch1 > 'z') && (ch1 < '0' || ch1 > '9') ){
                        left++;
                        continue;
                    }else if ((ch2 < 'a' || ch2 > 'z') && (ch2 < '0' || ch2 > '9')){
                        right --;
                        continue;
                    }
                    
                    if(ch1 == ch2){
                        left++;
                        right--;
                    }
                    else{
                        return false;
                    }
                }
        
                return true;
            }
            public char toLower(char ch){
                if(ch >= 'A' && ch <= 'Z'){
                    return (char)(ch+32);
                }
                return ch;
            }
        

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        IsPlaindrome obj = new IsPlaindrome();
        System.out.println(obj.isPalindrome(s)); // true
    }
}