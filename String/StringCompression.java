package String;

public class StringCompression {
    static void strCompression(char[] ch){
        // StringBuilder ans = new StringBuilder();

        // int count=1;
        // ans.append(s.charAt(0));

        // for(int i=1;i<s.length();i++){
        //     char curr = s.charAt(i);
        //     char prev = s.charAt(i-1);

        //     if(curr == prev){
        //         count++;
        //     }
        //     else{
        //         if(count>1) ans.append(count);
        //         ans.append(curr);
        //         count=1;
        //     }
        // }
        // if(count>1) ans.append(count);
        // return ans.toString();

        StringBuilder ans = new StringBuilder();

        int count=1;
        ans.append(ch[0]);
        
        for(int i=1;i<ch.length;i++){
            char curr = ch[i];
            char prev = ch[i-1];

            if(curr == prev){
                count++;
            }
            else{
                if(count>1) {
                    ans.append(count);
                }
                ans.append(curr);
                count=1;
            }
        }
        if(count>1){
            ans.append(count);
        }
        String s=ans.toString();
        ch = s.toCharArray();

        for(int j=0;j<ch.length;j++){
            System.out.println(ch[j]);
        }
        System.out.println(ans);
        // return ans.length();
    }
    public static void main(String[] args) {
        // String s = "aaabbbbcee";
        // System.out.println("Before : "+s);
        // System.out.println("After : "+strCompression(s));
        // char[] ch = {'a','a','b','b','c','c','c'};
        char[] ch = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        strCompression(ch);

    }
}
