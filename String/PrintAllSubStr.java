package String;

public class PrintAllSubStr {
    static void printSubStinngs(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                System.out.print(s.substring(i, j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        String s = "abbd";
        printSubStinngs(s);
    }
}
