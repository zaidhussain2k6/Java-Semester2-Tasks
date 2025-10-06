import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter First Number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter Operator (+)(-)(/)(*) : ");
        char op = scanner.next().charAt(0);
        
        System.out.print("Enter Second Number: ");
        double num2 = scanner.nextDouble();

        

        double result = 0;

        switch(op) {
            case '+':
                result = num1 + num2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result = " + result);
                break;
            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result = " + result);
                } else {
                    System.out.println("Error: Division by zero not allowed!");
                }
                break;
            default:
                System.out.println("Invalid choice!");
        }


        


        scanner.close();
    }

}
