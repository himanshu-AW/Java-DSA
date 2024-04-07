package String;

public class ReverseEachSubStr {
    static String revEachSubStr(String s){
        StringBuilder sb =  new StringBuilder();
        StringBuilder ans =  new StringBuilder();
        int prev=0,i;
        for(i = 0 ;i<s.length();i++){
            if(s.charAt(i)!=' '){
                continue;
            }else{
                sb.append(s.substring(prev, i));
                prev = i+1;
                ans.append(sb.reverse()+" ");
                sb = new StringBuilder();
            }
        }
        sb.append(s.substring(prev, i));
        ans.append(sb.reverse()+" ");
        return ans.toString();
    }
    public static void main(String[] args) {
        String s = "I am Himanshu Chauhan";
        System.out.println("Before : "+s);
        System.out.println("After : "+revEachSubStr(s));
    }
}
