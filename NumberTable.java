import java.util.Scanner;
public class NumberTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter any Number to Get Table: ");
        int num = scanner.nextInt();

        for (int i=1; i<=10; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }

        scanner.close();
    }
}
