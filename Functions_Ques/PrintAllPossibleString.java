// package Functions_Ques;

import java.util.ArrayList;

class PrintAllPossibleString {
    public static ArrayList<String> printSubStr(ArrayList<String> list,String str) {
        // ArrayList<String> list = new ArrayList<String>();
        list.add("");
        list.add("" + str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            int j = 0;
            char ch = str.charAt(i);
            while (j < list.size()) {
                String tmpStr = list.get(j) + ch;
                if(!list.contains(tmpStr)) 
                list.add(tmpStr);
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(printSubStr(list,"ravi"));
        // String str="ravi";
        // list.add("");
        // list.add("" + str.charAt(0));
        // for (int i = 1; i < str.length(); i++) {
        //     int j = 0;
        //     char ch = str.charAt(i);
        //     while (j < list.size()) {
        //         String tmpStr = list.get(j) + ch;
        //         if(!list.contains(tmpStr)) list.add(tmpStr);
        //         j++;
        //     }
        // }
        // System.out.println(list);
    }
}