import java.util.Scanner;
public class CheckLeapYear {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any year to Check Leap Year: ");
        int year = scanner.nextInt();
        
        if (year % 400 == 0) {
            System.out.println(year + " is Leap Year!");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not Leap Year!");
        } else if (year % 4 == 0) {
            System.out.println(year + " is Leap Year!");
        } else {
            System.out.println(year + " is not Leap Year!");
        }

        scanner.close();

    }
}
