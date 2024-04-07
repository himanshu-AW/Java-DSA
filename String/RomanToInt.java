package String;

import java.util.HashMap;

public class RomanToInt {
    static void  romanToInt(String str) {
        int n =  str.length();
        HashMap<Character,Integer> hm =  new HashMap<>();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        
        int result = hm.get(str.charAt(n-1));
        for(int i=n-2;i>=0;i--){
            int curr = hm.get(str.charAt(i));
            int last =  hm.get(str.charAt(i+1));
            if(curr<last) {
                result=result-curr;
            }
            else{
                result=result+curr;
            }
        }

        System.out.println(result);
    }
    public static void main(String[] args) {
        String str = "III";
        romanToInt(str);
        str= "LVIII";
        romanToInt(str);
        str= "MCMXCIV";
        romanToInt(str);
        
    }
}
