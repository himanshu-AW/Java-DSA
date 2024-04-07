import java.util.Scanner;
// create class CheckDataTypeExample to check the datatype of the variable  
public class CheckDataTypeExample {  
    // main() method start  
    public static void main(String args[]) {  

        // create Scanner class object to take input from user  
        Scanner sc = new Scanner(System.in);  
          
        // take input from the user to initialize variables  
          
        System.out.println("Enter a String value:");  
        String str = sc.nextLine();  
          
        System.out.println("Enter Integer value:");  
        int intData = sc.nextInt();  
          
        System.out.println("Enter Character value:");  
        char charData = sc.next().charAt(0);  
          
        // close Scanner class object  
        sc.close();  
          
        // show datatypes of variables by using getClass() and getSimpleName() methods  
        System.out.println(intData + " is of type " + ((Object)intData).getClass().getSimpleName());  
        System.out.println(charData + " is of type " + ((Object)charData).getClass().getSimpleName());  
        System.out.println(str + " is of type " + str.getClass().getSimpleName());  
    }  
}  