import java.util.Scanner;
public class Sum {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.print("Enter First Number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = scanner.nextInt();

        int result = num1 + num2;

        System.out.print("Result is: " + result);

        scanner.close();
    
    
    }
}