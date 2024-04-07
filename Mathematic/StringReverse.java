public class StringReverse {
    static String revStr(String str)
    {
        if(str.length() <= 0) return "";
        return str.charAt(str.length()-1) + revStr(str.substring(0, str.length()-1));
    }
    public static void main(String[] args) {
        System.out.println(revStr("Himanshu"));
    }
}
