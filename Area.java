import java.util.Scanner;
public class Area {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width;
        int length;

        System.out.print("Enter Width: ");
        width = scanner.nextInt();
        System.out.print("Enter Length: ");
        length = scanner.nextInt();

        int area = width * length;

        System.out.print("Area of Rectangle is: " + area);

        scanner.close();

    }
}