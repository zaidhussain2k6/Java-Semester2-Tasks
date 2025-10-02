import java.util.Scanner;
public class CompareNumbers {
    public static void main(String[] args){

        int x;
        int y;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Value of X: ");
        x = scanner.nextInt();
        System.out.print("Enter Value of Y: ");
        y = scanner.nextInt();

        if (x<y) {
            System.out.println("Y is Greater than X");            
        } else {
            System.out.println("X is Greater than Y");
        }



        scanner.close();

    }    
}
