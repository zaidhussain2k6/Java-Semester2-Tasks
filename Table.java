import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, start, end;

        System.out.print("Enter Number to Get Table: ");
        num = sc.nextInt();

        System.out.print("Enter Starting Number: ");
        start = sc.nextInt();

        System.out.print("Enter Ending Number: ");
        end = sc.nextInt();

        System.out.println("Table of: " + num);

        for(int i=start; i<=end; i++){
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
