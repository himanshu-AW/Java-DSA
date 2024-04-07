package String;

public class toggleStr {
    static String toggle(String s){
        StringBuilder sb =  new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch =  s.charAt(i);
            int ascii = (int)ch;
            if(ascii >=65 && ascii <=90){
                ascii+=32;
                ch = (char)ascii;
                sb.append(ch);
            }else if(ascii >=97 && ascii <=122){
                ascii-=32;
                ch = (char)ascii;
                sb.append(ch);
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "HoNey SinGh";
        System.out.println("Original String: "+s);
        System.out.println("Toggled String: "+toggle(s));
    }
}
