import java.util.Scanner;
public class LargestNumber {
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter First Number: ");
    int num1 = scanner.nextInt();

    System.out.print("Enter Second Number: ");
    int num2 = scanner.nextInt();

    System.out.print("Enter Third Number: ");
    int num3 = scanner.nextInt();

    System.out.println("--------------------");
    
    if (num1>num2 && num1>num3) {
        System.out.println("Greater number is " + num1);
    } else if (num2>num1 && num2>num3) {
        System.out.println("Greater number is " + num2);
    } else if (num3>num1 && num3>num2) {
        System.out.println("Greater number is " + num3);
    } else if (num1==num2 && num2==num3 && num1==num3) {
        System.out.println("All Numbers are Equal!");
    }



    scanner.close();

    }
}
