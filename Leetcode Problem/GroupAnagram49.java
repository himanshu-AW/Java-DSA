package ProbLC;

import java.util.*;
import java.util.Arrays;

public class GroupAnagram49{

    static boolean isAnagram(String str1, String str2){
        // convert two strings into character array 
            char[] newstr1 = str1.toCharArray();
            char[] newstr2 = str2.toCharArray();
        
            //short two charater array 
            Arrays.sort(newstr1);
            Arrays.sort(newstr2);

            if(Arrays.equals(newstr1, newstr2)){
                return true;
            }
            else{
                return false;
            }
    }
    //  if one string list if occured then remove it in main string-arr
    public static void main(String[] args) {
        //                      s     left              right
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        Set<List<String>> ans = new HashSet<>();
        List<String> temp = new ArrayList<>();
        String s="";
        for(int i=0;i<str.length;i++){
            s=str[i];
            int left=1+i;
            int right=str.length-1;
            if(!temp.contains(s))
                temp.add(s);
            while(left<=right){
                if(isAnagram(s,str[left])){
                    if(!temp.contains(str[left]))
                        temp.add(str[left]);
                    left++;
                }
                else if(isAnagram(s,str[right])){
                        if(!temp.contains(str[right]))
                            temp.add(str[right]);
                        right--;
                }
                else{
                    right--;
                    left++;
                }
            }
            ans.add(temp);
        }
        System.out.println(ans);
    }
}