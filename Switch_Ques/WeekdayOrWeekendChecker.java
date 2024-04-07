import java.util.Scanner;

public class WeekdayOrWeekendChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Weekday or Weekend Checker: Write a program that takes a day of the week as input and uses a switch statement to determine whether it's a weekday or a weekend day.
        System.out.println("** Check Whether the day is Weekday or Weekend day **");
        System.out.print("Enter a Day : ");
        String day = sc.nextLine();
        day = day.toLowerCase();
        switch (day) {
            case "monday" , "tuesday","wednessday","thusday","friday":
                System.out.println("WeekDay");
                break;
            case "saturday","sunday":
                System.out.println("Weekend Day");
                break;
            default:
                System.out.println("Please Enter Correct Day Name !!");
        }
        sc.close();
    }
}
