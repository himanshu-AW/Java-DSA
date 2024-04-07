package Functions_Ques;

public class ConvertUpperToLower_LowerToUpper {
    static char checkChar(char ch){
        int n = (int)ch;  // find ascii value of char.

        if( n>= 65 && n<90){  // that means char is in upper case
            n=n+32;  // convert upper to lower case
        } else if(n>=97 && n<122){  // that means char is in lower case
            n-=32;  // convert lower case to upper 
        }

        return (char)n; // find char of ascii value.
    }
    static String changeCase(StringBuilder s){
        for(int i=0;i<s.length();i++){
            char newch = checkChar(s.charAt(i));
            s.replace(i,i+1,""+newch);
        }
        
        return s.toString();
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hi, I'm Himanshu");
        System.out.println("Old String : "+str);
        System.out.println("New String : "+changeCase(str));

    }
}
