import java.util.Scanner;
public class Season_Determiner{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Season Determiner: Create a program that takes a month as input and uses a switch statement to determine the season (e.g., spring, summer, fall, or winter) associated with that month.

        System.out.println("** Check Season in Which Months is Occured  **");
        System.out.print("Enter a Month : ");
        String month = sc.nextLine();
        month = month.toLowerCase();
        switch (month) {
            case "december", "january" ,"february":
                System.out.println(" Winter Season ");
                break;
            case "march", "april" ,"may":
                System.out.println("Spring Season");
                break;
            case "june", "july" ,"august":
                System.out.println("Summer Season");
                break;
            case "september", "october" ,"november":
                System.out.println("Autom/fall Season");
                break;
            default:
                System.out.println("Please Enter Correct Month Name !!");
        }
        sc.close();
    }
}